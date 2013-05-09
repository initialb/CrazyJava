package org.crazyit.book.vo;

/**
 * �鱾����¼����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class BookInRecord extends ValueObject {
	//��Ӧ������, �����ݿ�����ʱ��ֵ
	private String BOOK_ID_FK;
	//��Ӧ���ۼ�¼���
	private String T_IN_RECORD_ID_FK;
	//�������
	private String IN_SUM;
	
	//�ü�¼����Ӧ����, �����ݿ�����ʱΪnull
	private Book book;
	
	//�ü�¼����Ӧ�ĺͿ��¼, �����ݿ�����ʱΪnull
	private InRecord inRecord;

	public String getBOOK_ID_FK() {
		return BOOK_ID_FK;
	}

	public void setBOOK_ID_FK(String book_id_fk) {
		BOOK_ID_FK = book_id_fk;
	}

	public String getT_IN_RECORD_ID_FK() {
		return T_IN_RECORD_ID_FK;
	}

	public void setT_IN_RECORD_ID_FK(String t_in_record_id_fk) {
		T_IN_RECORD_ID_FK = t_in_record_id_fk;
	}

	public String getIN_SUM() {
		return IN_SUM;
	}

	public void setIN_SUM(String in_sum) {
		IN_SUM = in_sum;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public InRecord getInRecord() {
		return inRecord;
	}

	public void setInRecord(InRecord inRecord) {
		this.inRecord = inRecord;
	}
	
}
