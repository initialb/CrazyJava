package org.crazyit.book.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ���Թ�����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class PropertiesUtil {
	//�����б�
	private static Properties properties = new Properties();
	//�����ļ���·��
	private static String CONFIG = "/cfg/jdbc.properties";
	//��ȡ��Դ�ļ�, ����������
	private static InputStream is = PropertiesUtil.class.getResourceAsStream(CONFIG);
	//���ݿ�����
	public static String JDBC_DRIVER;
	//jdbc����url
	public static String JDBC_URL;
	//���ݿ��û���
	public static String JDBC_USER;
	//���ݿ�����
	public static String JDBC_PASS;
	static {
		try {
			//����������
			properties.load(is);
			//������õĸ�������
			JDBC_DRIVER = properties.getProperty("jdbc.driver");
			JDBC_URL = properties.getProperty("jdbc.url");
			JDBC_USER = properties.getProperty("jdbc.user");
			JDBC_PASS = properties.getProperty("jdbc.pass");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
