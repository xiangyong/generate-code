package com.letv.ofc.utils;

/**
 * @author zhaohengchong
 * @email zhaohengchong@letv.com
 * @version 2014-7-16 下午04:27:08
 */
public class StringHelper {

	/**
	 * 判断字符串是否为空
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isNull(String value) {
		if (value == null || "".equals(value) || "".equals(value.trim()) || "null".equals(value)) {
			return true;
		}
		return false;
	}
}
