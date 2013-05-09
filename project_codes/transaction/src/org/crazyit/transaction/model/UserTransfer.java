package org.crazyit.transaction.model;

/**
 * ��¼�û�ת���������¼
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class UserTransfer extends ValueObject {

	//����ID
	private String TS_ID;
	
	//����ת���������û�
	private String USER_ID;
	
	//����ת��������Ŀ���û�
	private String TARGET_USER_ID;
	
	//����ת�������û��Ը������ת��ʱ��
	private String OPERATE_DATE;

	public String getTS_ID() {
		return TS_ID;
	}

	public void setTS_ID(String ts_id) {
		TS_ID = ts_id;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String user_id) {
		USER_ID = user_id;
	}

	public String getTARGET_USER_ID() {
		return TARGET_USER_ID;
	}

	public void setTARGET_USER_ID(String target_user_id) {
		TARGET_USER_ID = target_user_id;
	}

	public String getOPERATE_DATE() {
		return OPERATE_DATE;
	}

	public void setOPERATE_DATE(String operate_date) {
		OPERATE_DATE = operate_date;
	}
	
	
}
