package org.crazyit.book.dao.impl;

import java.sql.ResultSet;
import java.util.Collection;

import org.crazyit.book.commons.DataUtil;
import org.crazyit.book.jdbc.JDBCExecutor;
import org.crazyit.book.vo.ValueObject;

public class CommonDaoImpl {
	//����JDBCExecutor����
	public JDBCExecutor getJDBCExecutor() {
		return JDBCExecutor.getJDBCExecutor();
	}
	
	//���ݲ�����SQL, ��Ž���ļ��϶���, �;�������ݿ�ӳ����󷵻�һ������
	public Collection getDatas(String sql, Collection<ValueObject> result, 
			Class clazz) {
		//ִ��SQL����ResultSet����
		ResultSet rs = getJDBCExecutor().executeQuery(sql);
		//��ResultSet���з�װ�����ؼ���
		return DataUtil.getDatas(result, rs, clazz);
	}
}
