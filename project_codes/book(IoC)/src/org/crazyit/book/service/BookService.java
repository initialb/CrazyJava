package org.crazyit.book.service;

import java.util.Collection;

import org.crazyit.book.vo.Book;

public interface BookService {

	/**
	 * ����ȫ������
	 * @return
	 */
	Collection<Book> getAll();
	
	/**
	 * ����id��ȡ��
	 * @param id
	 * @return
	 */
	Book get(String id);
	
	/**
	 * ����һ����
	 * @param book
	 * @return
	 */
	Book add(Book book);
	
	/**
	 * �޸�һ����
	 * @param book
	 * @return
	 */
	Book update(Book book);
	
	/**
	 * ��������ģ����ѯ
	 * @param name
	 * @return
	 */
	Collection<Book> find(String name);
}
