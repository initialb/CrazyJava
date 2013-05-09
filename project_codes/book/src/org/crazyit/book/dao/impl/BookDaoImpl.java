package org.crazyit.book.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import org.crazyit.book.dao.BookDao;
import org.crazyit.book.vo.Book;

/**
 * �鱾DAOʵ����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class BookDaoImpl extends CommonDaoImpl implements BookDao {

	@Override
	public Book find(String id) {
		String sql = "SELECT * FROM T_BOOK book WHERE book.ID='" + id + "'";
		List<Book> datas =  (List<Book>)getDatas(sql, new ArrayList(), Book.class);
		return datas.get(0);
	}

	@Override
	public Collection<Book> findAll() {
		String sql = "SELECT * FROM T_BOOK book ORDER BY book.ID desc";
		return getDatas(sql, new Vector(), Book.class);
	}

	@Override
	public String add(Book book) {
		//����book����ƴװSQL
		String sql = "INSERT INTO T_BOOK VALUES (ID, '" + book.getBOOK_NAME() + "', '" + 
		book.getBOOK_INTRO() + "', '" + book.getBOOK_PRICE() + "', '" + book.getTYPE_ID_FK() + 
		"', '" + book.getPUB_ID_FK() + "', '" + book.getIMAGE_URL() + 
		"', '" + book.getAUTHOR() + "', '" + book.getREPERTORY_SIZE() + "')";
		//ִ��SQL������ID
		return String.valueOf(getJDBCExecutor().executeUpdate(sql));
	}

	@Override
	public String update(Book book) {
		String sql = "UPDATE T_BOOK book SET book.BOOK_NAME='" + book.getBOOK_NAME() + 
		"', book.BOOK_INTRO='" + book.getBOOK_INTRO() + "', book.BOOK_PRICE='" + 
		book.getBOOK_PRICE() + "', book.TYPE_ID_FK='" + book.getTYPE_ID_FK() + 
		"', book.PUB_ID_FK='" + book.getPUB_ID_FK() + "', book.IMAGE_URL='" + 
		book.getIMAGE_URL() + "', book.AUTHOR='" + book.getAUTHOR() + 
		"' WHERE book.ID='" + book.getID() + "'";
		getJDBCExecutor().executeUpdate(sql);
		return book.getID();
	}

	@Override
	public Collection<Book> findByName(String name) {
		String sql = "SELECT * FROM T_BOOK book WHERE book.BOOK_NAME like '%" + name 
		+ "%'" + " ORDER BY book.ID DESC";
		return getDatas(sql, new Vector(), Book.class);
	}

	@Override
	public void updateRepertory(Book b) {
		String sql = "UPDATE T_BOOK book SET book.REPERTORY_SIZE='" + b.getREPERTORY_SIZE() + 
		"' WHERE book.ID='" + b.getID() + "'";
		getJDBCExecutor().executeUpdate(sql);
	}
	
	

}
