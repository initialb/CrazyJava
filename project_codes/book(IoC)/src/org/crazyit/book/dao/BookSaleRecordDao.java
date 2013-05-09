package org.crazyit.book.dao;

import java.util.Collection;

import org.crazyit.book.vo.BookSaleRecord;

public interface BookSaleRecordDao {

	/**
	 * �������ۼ�¼id��ȡ�����ۼ�¼�����е�������ۼ�¼
	 * @param saleRecordId
	 * @return
	 */
	Collection<BookSaleRecord> findBySaleRecord(String saleRecordId);

	/**
	 * ����һ��������ۼ�¼
	 * @param record
	 * @return
	 */
	String saveBookSaleRecord(BookSaleRecord record);
	
}
