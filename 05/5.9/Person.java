

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
public class Person
{
	//���涨��һ����ʼ����
	{
		int a = 6;
		//�ڳ�ʼ������
		if (a > 4)
		{
		System.out.println("Person��ʼ���飺�ֲ�����a��ֵ����4");
		}
		System.out.println("Person�ĳ�ʼ����");
	}
	//����ڶ�����ʼ����
	{
		System.out.println("Person�ĵڶ�����ʼ����");
	}
	//�����޲����Ĺ�����
	public Person()
	{
		System.out.println("Person����޲���������");
	}
	public static void main(String[] args) 
	{
		new Person();
	}
}

