package org.crazyit.book.service;

import java.util.Collection;

import org.crazyit.book.vo.Concern;

public interface ConcernService {

	/**
	 * ��ȡȫ���ĳ�����
	 * @return
	 */
	Collection<Concern> getAll();
	
	/**
	 * ����id����һ��������
	 * @param id ������id
	 * @return
	 */
	Concern find(String id);
	
	/**
	 * ���һ��������
	 * @param c
	 * @return
	 */
	Concern add(Concern c);
	
	/**
	 * �޸�һ��������
	 * @param c
	 * @return
	 */
	Concern update(Concern c);
	
	/**
	 * ���ݳ���������ģ������
	 * @param name
	 * @return
	 */
	Collection<Concern> query(String name);
}
