
import java.io.*;
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
public class FilenameFilterTest
{
	public static void main(String[] args) 
	{
		File file = new File(".");
		String[] nameList = file.list(new MyFilenameFilter());
		for(String name : nameList)
		{
			System.out.println(name);
		}
	}
}
// ʵ���Լ���FilenameFilterʵ����
class MyFilenameFilter implements FilenameFilter
{
	public boolean accept(File dir, String name)
	{
		// ����ļ�����.java��β�������ļ���Ӧһ��·��������true
		return name.endsWith(".java")
			|| new File(name).isDirectory();
	}
}

