package org.crazyit.transaction.model;

/**
 * ��ɫ��
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class Role extends ValueObject {
	
	//��ɫ����, �羭��, �ܼ�
	private String ROLE_NAME;

	public String getROLE_NAME() {
		return ROLE_NAME;
	}

	public void setROLE_NAME(String role_name) {
		ROLE_NAME = role_name;
	}

	public String toString() {
		return this.ROLE_NAME;
	}
}
