package org.crazyit.transaction.model;

import java.util.Date;

/**
 * ���������
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class Comment extends ValueObject {

	//���۱���
	private String CM_TITLE;
	//��������
	private String CM_CONTENT;
	//��������
	private String CM_DATE;
	//������ID
	private String USER_ID;
	
	//���۵�����
	private String TRANSACTION_ID;
	
	private User user;
	
	private Transaction transaction;

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String user_id) {
		USER_ID = user_id;
	}

	public String getTRANSACTION_ID() {
		return TRANSACTION_ID;
	}

	public void setTRANSACTION_ID(String transaction_id) {
		TRANSACTION_ID = transaction_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public String getCM_TITLE() {
		return CM_TITLE;
	}

	public void setCM_TITLE(String cm_title) {
		CM_TITLE = cm_title;
	}

	public String getCM_CONTENT() {
		return CM_CONTENT;
	}

	public void setCM_CONTENT(String cm_content) {
		CM_CONTENT = cm_content;
	}

	public String getCM_DATE() {
		return CM_DATE;
	}

	public void setCM_DATE(String cm_date) {
		CM_DATE = cm_date;
	}


	
	
}
