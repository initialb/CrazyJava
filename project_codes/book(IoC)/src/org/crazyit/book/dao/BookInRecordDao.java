package org.crazyit.book.dao;

import java.util.Collection;

import org.crazyit.book.vo.BookInRecord;

public interface BookInRecordDao {

	/**
	 * ��������¼����ȫ�����������¼
	 * @param inRecordId
	 * @return
	 */
	Collection<BookInRecord> findByInRecord(String inRecordId);
	
	/**
	 * ����һ���������¼, �����ظü�¼��id
	 * @param r
	 * @return
	 */
	String save(BookInRecord r);
}
