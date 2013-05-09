package org.crazyit.book.service;

import java.util.Collection;
import java.util.Date;

import org.crazyit.book.vo.SaleRecord;

public interface SaleRecordService {

	/**
	 * ����һ�����ۼ�¼
	 * @param record
	 */
	void saveRecord(SaleRecord record);
	
	/**
	 * �������ڻ�ȡ�����ڶ�Ӧ�����ۼ�¼
	 * @param date
	 * @return
	 */
	Collection<SaleRecord> getAll(Date date);
	
	/**
	 * ����id��ȡ���ۼ�¼
	 * @param id
	 * @return
	 */
	SaleRecord get(String id);
	
}
