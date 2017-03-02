package com.example.base.util;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

public class Base64Utils {
	static final String CHARSET_NAME = "UTF-8";

	public static String decode(String base64Data) throws UnsupportedEncodingException {
		return new String(Base64.decodeBase64(base64Data.getBytes(CHARSET_NAME)), "UTF-8");
	}

	public static String encode(String binaryData) throws UnsupportedEncodingException {
		return new String(Base64.encodeBase64(binaryData.getBytes(CHARSET_NAME)));
	}
}