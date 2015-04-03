package com.letv.ofc.utils;


import org.apache.commons.codec.binary.Base64;


/**
 * Created with IntelliJ IDEA.
 * User: zhaoyanan
 * Date: 14-8-14
 * Time: 下午5:55
 * To change this template use File | Settings | File Templates.
 */
public class BASE64Coding {
    private static Base64 base = new Base64();
    public BASE64Coding() {}
    public static String encode (String s)
    {
        return base.encodeAsString(s.getBytes());
    }
    public static String decode (String s){
        byte[] temp = base.decode(s);
        return new String(temp);
    }

    public static byte[] decodeByte (String s){
        byte[] temp = base.decode(s);
        return  temp;
    }
}
