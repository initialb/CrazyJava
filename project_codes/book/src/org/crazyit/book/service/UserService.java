package org.crazyit.book.service;

/**
 * �û�ҵ��ӿ�
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public interface UserService {

	/**
	 * �û���¼�ķ���, �����¼ʧ�ܣ����׳�BusinessException
	 * @param name
	 * @param password
	 */
	void login(String name, String password);
}
