package org.crazyit.book.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * SQLִ����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class JDBCExecutor {
	//�������
	private static String DRIVER = PropertiesUtil.JDBC_DRIVER;
	//���url
	private static String URL = PropertiesUtil.JDBC_URL;
	//����������ݿ���û���
	private static String USER = PropertiesUtil.JDBC_USER;
	//����������ݿ������
	private static String PASS = PropertiesUtil.JDBC_PASS;
	//���Ӷ���
	private Connection connection;
	//ά��һ�������͵Ķ���
	private static JDBCExecutor jdbcExecutor;
	//Statement����,����ִ��SQL��䲢���ؽ��
	private Statement stmt;
	
	//˽�й�����
	private JDBCExecutor() {
		try {
			//��ʼ��JDBC���������������ص�jvm��
			Class.forName(DRIVER);
			//�������ݿ�����
			connection = DriverManager.getConnection(URL, USER, PASS);
			//����Statement����
			stmt = connection.createStatement();
		} catch (Exception e) {
			throw new JDBCException(e.getMessage());
		}
	}
	
	//�ṩһ����̬�������ر����ʵ��
	public static JDBCExecutor getJDBCExecutor() {
		//���������ά��jdbcExecutor����Ϊ��,�����˽�еĹ��������ʵ��
		if (jdbcExecutor == null) {
			jdbcExecutor = new JDBCExecutor();
		}
		return jdbcExecutor;
	}
	
	/*
	 * ִ��һ���ѯ��sql
	 */
	public ResultSet executeQuery(String sql) {
		try {
			//����Statement����ִ�в�����sql
			ResultSet result = stmt.executeQuery(sql);
			return result;
		} catch (Exception e) {
			throw new QueryException(e.getMessage());
		}
	}
	
	//ִ�е���INSERT��UPDATE �� DELETE ���, ���ִ��INSERTʱ, ��������
	public int executeUpdate(String sql) {
		int result = -1;
		try {
			//ִ��SQL���
			stmt.executeUpdate(sql);
			//�������
			ResultSet rs = stmt.getGeneratedKeys();
			while(rs.next()) {
				//�������һ������
				result = rs.getInt(1);
			}
			rs.close();
			return result;
		} catch (Exception e) {
			throw new QueryException(e.getMessage());
		}
	}

}
