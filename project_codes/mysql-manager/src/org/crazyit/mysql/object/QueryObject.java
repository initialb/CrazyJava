package org.crazyit.mysql.object;

import java.sql.ResultSet;

/**
 * ���в�ѯ�Ľӿ�, ��DataFrame��ʹ��
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public interface QueryObject {
	
	/**
	 * �õ�����
	 * @return
	 */
	ResultSet getDatas(String orderString);
	
	/**
	 * �õ���ѯ������
	 * @return
	 */
	String getQueryName();
	
	/**
	 * ���ز�ѯ��SQL
	 * @return
	 */
	String getQuerySQL(String orderString);
	
}
