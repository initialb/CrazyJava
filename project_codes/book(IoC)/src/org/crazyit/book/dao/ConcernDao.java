package org.crazyit.book.dao;

import java.util.Collection;

import org.crazyit.book.vo.Concern;

public interface ConcernDao {

	/**
	 * ����ȫ���ĳ�����
	 * @return
	 */
	Collection<Concern> findAll();
	
	/**
	 * ����ID���ҳ�����
	 * @param id
	 * @return
	 */
	Concern find(String id);
	
	/**
	 * ���һ��������
	 * @param concern 
	 * @return
	 */
	String add(Concern concern);
	
	/**
	 * �޸�һ��������
	 * @param concern
	 * @return
	 */
	String update(Concern concern);
	
	/**
	 * ��������ģ�����ҳ�����
	 * @param name
	 * @return
	 */
	Collection<Concern> findByName(String name);
}
