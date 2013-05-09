
import java.io.*;
import java.util.*;
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
public class SystemTest
{
	public static void main(String[] args) throws Exception
	{
		//��ȡϵͳ���еĻ�������
		Map<String,String> env = System.getenv();
		for (String name : env.keySet())
		{
			System.out.println(name + " ---> " + env.get(name));
		}
		//��ȡָ������������ֵ
		System.out.println(System.getenv("JAVA_HOME"));
		//��ȡ���е�ϵͳ����
		Properties props = System.getProperties();
		//������ϵͳ���Ա��浽props.txt�ļ���
		props.store(new FileOutputStream("props.txt") 
			, "System Properties");
		//����ض���ϵͳ����
		System.out.println(System.getProperty("os.name"));
	}
}
