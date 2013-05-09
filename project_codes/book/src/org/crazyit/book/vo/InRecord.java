package org.crazyit.book.vo;

import java.util.Vector;

/**
 * ����¼
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class InRecord extends ValueObject {

	//�������
	private String RECORD_DATE;
	
	//����������
	private int amount;
	
	//������¼����Ӧ���������¼
	private Vector<BookInRecord> bookInRecords;
	
	//����������, �Զ��Ÿ���
	private String bookNames;

	public String getRECORD_DATE() {
		return RECORD_DATE;
	}

	public void setRECORD_DATE(String record_date) {
		RECORD_DATE = record_date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Vector<BookInRecord> getBookInRecords() {
		return bookInRecords;
	}

	public void setBookInRecords(Vector<BookInRecord> bookInRecords) {
		this.bookInRecords = bookInRecords;
	}

	public String getBookNames() {
		return bookNames;
	}

	public void setBookNames(String bookNames) {
		this.bookNames = bookNames;
	}
	
	
}
