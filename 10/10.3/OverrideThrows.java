
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
public class OverrideThrows
{
	public void test()throws IOException
	{
		FileInputStream fis = new FileInputStream("a.txt");
	}
}
class Sub extends OverrideThrows
{
	// ���෽�������׳��˱ȸ��෽��������쳣
	// �������淽������
	public void test()throws Exception
	{
	}
}

