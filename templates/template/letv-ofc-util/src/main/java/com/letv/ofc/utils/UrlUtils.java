package com.letv.ofc.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * @author zhaohengchong
 * @email  zhaohengchong@letv.com
 * @version 2014-8-15 下午08:16:30 
 */
public final class UrlUtils {
	
	private final static Log logger = LogFactory.getLog(UrlUtils.class);
    
    private static final String[] RESERVED_CHARS = {"+"};
    private static final String[] ENCODED_CHARS = {"%2b"};
    
    private UrlUtils() {
        
    }

    /**
     * Decodes using URLDecoder - use when queries or form post values are decoded
     * @param value value to decode
     * @return
     */
    public static String urlDecode(String value) {
        try {
            value = URLDecoder.decode(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
        	logger.error("UTF-8 encoding can not be used to decode " + value, e);          
        }
        return value;
    }
    
    /**
     * URL path segments may contain '+' symbols which should not be decoded into ' '
     * This method replaces '+' with %2B and delegates to URLDecoder
     * @param value value to decode
     * @return
     */
    public static String pathDecode(String value) {
        // TODO: we actually need to do a proper URI analysis here according to
        // http://tools.ietf.org/html/rfc3986
        for (int i = 0; i < RESERVED_CHARS.length; i++) {
            if (value.indexOf(RESERVED_CHARS[i]) != -1) {
                value = value.replace(RESERVED_CHARS[i], ENCODED_CHARS[i]);
            }
        }
        
        return urlDecode(value);
    }
    
}
