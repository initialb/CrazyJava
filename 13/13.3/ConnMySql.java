
import java.sql.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ConnMySql
{
	public static void main(String[] args) throws Exception
	{
		// 1.����������ʹ�÷����֪ʶ�����ڼ�ס��ôд��
		Class.forName("com.mysql.jdbc.Driver");
		try(
			// 2.ʹ��DriverManager��ȡ���ݿ�����,
			// ���з��ص�Connection�ʹ�����Java��������ݿ������
			// ��ͬ���ݿ��URLд����Ҫ�������ĵ�֪�����û�����������DBA����
			Connection conn = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/select_test"
				, "root" , "32147");
			// 3.ʹ��Connection������һ��Statment����
			Statement stmt = conn.createStatement();
			// 4.ִ��SQL���
			/*
			Statement������ִ��sql���ķ�����
			1 execute ��ִ���κ�SQL��䡣- ����һ��booleanֵ��
			  ���ִ�к��һ�������ResultSet���򷵻�true�����򷵻�false
			2 executeQuery ִ��Select��� �� ���ز�ѯ���Ľ����
			3 executeUpdate ����ִ��DML��䡣�� ����һ��������
			  ����SQL���Ӱ��ļ�¼����
			*/
			ResultSet rs = stmt.executeQuery("select s.* , teacher_name"
				+ " from student_table s , teacher_table t"
				+ " where t.teacher_id = s.java_teacher"))
		{
			// ResultSet��ϵ�е�getXxx(������ | ����)�����ڻ�ȡ��¼ָ��
			// ָ���С��ض��е�ֵ�����ϵ�ʹ��next()����¼ָ������һ�У�
			// ����ƶ�֮���¼ָ����Ȼָ����Ч�У���next()��������true��
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "\t"
					+ rs.getString(2) + "\t"
					+ rs.getString(3) + "\t"
					+ rs.getString(4));
			}
		}
	}
}
