

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
interface A
{
	void test();
}
public class ATest
{
	public static void main(String[] args) 
	{
		int age = 0;
		A a = new A()
		{
			public void test()
			{
				//������佫��ʾ����
				//�����ڲ����ڷ��ʾֲ���������ʹ��final����
				System.out.println(age);
			}
		};
	}
}
