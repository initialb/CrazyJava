
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
public class ThrowsTest2
{
	public static void main(String[] args)
		throws Exception
	{
		//��Ϊtest()���������׳�IOException�쳣��
		//���Ե��ø÷����Ĵ���Ҫô����try...catch���У�
		//Ҫô������һ����throws�����׳��ķ����С�
		test();
	}
	public static void test()throws IOException
	{
		//��ΪFileInputStream�Ĺ����������׳�IOException�쳣��
		//���Ե���FileInputStream�Ĵ���Ҫô����try...catch���У�
		//Ҫô������һ����throws�����׳��ķ����С�
		FileInputStream fis = new FileInputStream("a.txt");
	}
}
