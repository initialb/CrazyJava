package org.crazyit.transaction.model;

/**
 * �û�
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class User extends ValueObject {
	
	//�û�����
	private String USER_NAME;
	
	//����
	private String PASS_WD;
	
	//�û���ɫid, ���ݿ��ֶ�
	private String ROLE_ID;
	
	//�û���ʵ����
	private String REAL_NAME;
	
	//�Ƿ�ɾ��, 0û�б�ɾ��, 1Ϊ�Ѿ�ɾ��
	private String IS_DELETE;
	
	//�û���ɫ, �����������ݿ�
	private Role role;

	public String getUSER_NAME() {
		return USER_NAME;
	}

	public void setUSER_NAME(String user_name) {
		USER_NAME = user_name;
	}

	public String getROLE_ID() {
		return ROLE_ID;
	}

	public void setROLE_ID(String role_id) {
		ROLE_ID = role_id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getREAL_NAME() {
		return REAL_NAME;
	}

	public void setREAL_NAME(String real_name) {
		REAL_NAME = real_name;
	}

	public String getIS_DELETE() {
		return IS_DELETE;
	}

	public void setIS_DELETE(String is_delete) {
		IS_DELETE = is_delete;
	}

	public String getPASS_WD() {
		return PASS_WD;
	}

	public void setPASS_WD(String pass_wd) {
		PASS_WD = pass_wd;
	}

	
}
