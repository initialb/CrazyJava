package org.crazyit.transaction.model;

public class Log extends ValueObject {

	//��¼������
	private String LOG_DATE;
	
	//������
	private String HANDLER_ID;
	
	//��Ӧ������
	private String COMMENT_ID;
	
	//��Ӧ������
	private String TS_ID;
	
	//��־����
	private String TS_DESC;
	
	private Comment comment;
	
	private User handler;

	public String getLOG_DATE() {
		return LOG_DATE;
	}

	public void setLOG_DATE(String log_date) {
		LOG_DATE = log_date;
	}

	public String getHANDLER_ID() {
		return HANDLER_ID;
	}

	public void setHANDLER_ID(String handler_id) {
		HANDLER_ID = handler_id;
	}

	public String getCOMMENT_ID() {
		return COMMENT_ID;
	}

	public void setCOMMENT_ID(String comment_id) {
		COMMENT_ID = comment_id;
	}

	public String getTS_ID() {
		return TS_ID;
	}

	public void setTS_ID(String ts_id) {
		TS_ID = ts_id;
	}

	public String getTS_DESC() {
		return TS_DESC;
	}

	public void setTS_DESC(String ts_desc) {
		TS_DESC = ts_desc;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public User getHandler() {
		return handler;
	}

	public void setHandler(User handler) {
		this.handler = handler;
	}

}
