

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
public class StaticInnerClassTest
{
	private int prop1 = 5;
	private static int prop2 = 9;
	static class StaticInnerClass
	{
		//��̬�ڲ�������԰�����̬��Ա
		private static int age;
		public void accessOuterProp()
		{
			//���������ִ���
			//��̬�ڲ����޷������ⲿ���ʵ����Ա
			System.out.println(prop1);
			//�����������
			System.out.println(prop2);
		}
	}
}

