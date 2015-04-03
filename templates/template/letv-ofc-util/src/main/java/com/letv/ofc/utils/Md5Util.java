package com.letv.ofc.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

public class Md5Util {

	private static Log log = LogFactory.getLog(Md5Util.class);
	
	
	public static boolean signature(String content,String key,String sign){
		BASE64Encoder base64 = new BASE64Encoder();
		try {
			String new_sign = base64.encode(get32MD5(content + key).getBytes());
			log.info("new_sign==="+new_sign);
			if(!new_sign.equals(sign)) return false;
		} catch(Exception ex) {
			log.error(ex);
			return false;
		}
		return true;
	}
	public static String encode(String content,String key){
		BASE64Encoder base64 = new BASE64Encoder();
		try {
			return    base64.encode(get32MD5(content + key).getBytes("UTF-8"));
			
		} catch(Exception ex) {
			log.error(ex);
			return null;
		}
	}
	public static String get32MD5(String args){
		char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'}; 
		try { 
			byte[] strTemp = args.getBytes("UTF-8"); 
			MessageDigest mdTemp = MessageDigest.getInstance("MD5"); 
			mdTemp.update(strTemp); 
			byte[] md = mdTemp.digest(); 
			int j = md.length; 
			char str[] = new char[j * 2]; 
			int k = 0; 
			for (int i = 0; i < j; i++) { 
				byte byte0 = md[i]; 
				str[k++] = hexDigits[byte0 >>> 4 & 0xf]; 
				str[k++] = hexDigits[byte0 & 0xf]; 
			} 
			return new String(str); 
		} 
		catch (Exception e){ 
			return null; 
		} 
	} 
	
		/**
	    * 加密处理
	    * @param plainText
	    * @return
	    */
	   public static String crypt(byte bytes[]) {
	      
	     StringBuffer buf = new StringBuffer();
	     for (int offset = 0; offset < bytes.length; offset++) {
	        int i = bytes[offset];
	        if (i < 0){
	        	i += 256;
	        }
	        if (i < 16){
	        	buf.append("0");
	        }
	        buf.append(Integer.toHexString(i));
	     }
	     return buf.toString();
	   }
	   
	   public static String generateSign(String data,String encoding) {
			//1.MD5编码
		   String sign=null;
				
				try {
					byte[] bytes = md5(data.getBytes(encoding));
				
					//2.加密处理
					sign = crypt(bytes);
					
					//3.BASE64编码
					BASE64Encoder encoder = (new BASE64Encoder());

					sign = encoder.encode(sign.getBytes(encoding));

					log.info("generateSign letvedi encoding = ".concat(encoding));
				} catch (UnsupportedEncodingException e) {
					log.error(e);
				} catch (Exception e) {
					log.error(e);
				}

			return sign;
	   }

	   public static byte[] md5(byte[] input) throws Exception {
			MessageDigest alg =
				MessageDigest.getInstance("MD5");
				alg.update(input);
			byte[] digest = alg.digest();
			
			return digest;
		}
	   /**
	    * 签名校验
	    * @param content 报文体
	    * @param key 秘钥
	    * @param sign 传入签名
	    * @return 通过true；不通过false
	    */
	   public static boolean check(String content,String key,String sign){
		   String sign_new = generateSign(content+key,"UTF-8");
		   if(sign_new!=null && sign_new.equals(sign)){			   
			   return true;
		   }
		   log.info("签名验证不通过！生成签名为："+sign_new+"--------------传入签名为："+sign);
		   return false;
	   }
	   
	   public static void main(String[] args) throws UnsupportedEncodingException {
			//String rdm2 = getConsKey();
//			String code = "<?xml version=\"1.0\" encoding=\"utf-8\" ?><UpdateInfo><logisticProviderID>WangJiuWang</logisticProviderID><orderNo>F11209291844723</orderNo><infoType>STATUS</infoType><infoContent>GOT</infoContent><acceptTime>2012-09-29 19:11:17</acceptTime><mailNo>hswuliudan2</mailNo><remark/></UpdateInfo>";
			String code = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><request><order_no>T1407221481803</order_no><out_stock_time>2014-07-22 16:39:47.679</out_stock_time><warehouse_no>LE001</warehouse_no><task_type>LE201</task_type><user_name>??1234</user_name><product_items><product><sku_no>409900000269</sku_no><product_num>1</product_num><reason_desc>LEZT001</reason_desc></product></product_items></request>";
			//String verifyData = getVerifyData("cx6o", "cx6o", code/*"<?xml version=\"1.0\" encoding=\"utf-8\" ?><UpdateInfo><logisticProviderID>WangJiuWang</logisticProviderID><orderNo>F11209291808116</orderNo><infoType>STATUS</infoType><infoContent>SIGNED</infoContent><name>孟庆炜</name><acceptTime>2012-09-29 15:05:18</acceptTime><mailNo>ZJS000001</mailNo><remark/></UpdateInfo>"*/);

//			System.out.println(rdm1);
//			System.out.println(rdm2);
//			System.out.println(verifyData);
			
			System.out.println(generateSign(code+"1234","UTF-8"));
	   }

	   
}
