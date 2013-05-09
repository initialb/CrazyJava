package org.crazyit.gamehall.commons;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/**
 * ��������Ӧ����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class Response {

	//���������صĸ�����ֵ
	private Map<String, Object> datas;
	
	//�������
	private String errorCode;
	
	//�ͻ��˴�����, ��ֵ������Request�����������Map��
	private String actionClass;
	
	public Response(String actionClass) {
		this.datas = new HashMap<String, Object>();
		this.actionClass = actionClass;
	}
	
	public void setData(String key, Object value) {
		this.datas.put(key, value);
	}
	
	public Object getData(String key) {
		return this.datas.get(key);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getActionClass() {
		return actionClass;
	}

	public void setActionClass(String actionClass) {
		this.actionClass = actionClass;
	}

	
}
