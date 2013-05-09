package org.crazyit.gamehall.fivechess.commons.util;

import java.util.HashMap;
import java.util.Map;

/**
 * ������Ϣ
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class FiveChessErrorCode {

	public static final String HAS_SIT_DOWN = "has sit down";
	
	public static final String SEAT_HAS_USER = "seat has user";
	
	public static Map<String, String> errorMessages = new HashMap<String, String>();
	
	static {
		errorMessages.put(HAS_SIT_DOWN, "���Ѿ�������");
		errorMessages.put(SEAT_HAS_USER, "����λ�Ѿ�����");
	}
	
	public static String getMessage(String code) {
		return errorMessages.get(code);
	}
}
