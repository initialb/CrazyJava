package org.crazyit.transaction.dao;

import java.util.List;

import org.crazyit.transaction.model.Log;

public interface LogDao {

	/**
	 * ����һ����־
	 * @param log
	 */
	void save(Log log);
	
	/**
	 * ��������id������־
	 * @param transactionId
	 * @return
	 */
	List<Log> find(String transactionId);
}
