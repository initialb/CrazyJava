

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
public class VariableOverrideTest
{
	//����һ��nameʵ��Field
	private String name = "���";
	//����һ��price��Field
	private static double price = 78.0;
	//����������������
	public static void main(String[] args) 
	{
		//������ľֲ��������ֲ��������ǳ�Ա����
		int price = 65;
		//ֱ�ӷ���price�����������price�ֲ�������ֵ��65
		System.out.println(price);
		//ʹ��������Ϊprice�������޶���
		//�����price��Field��ֵ��78.0
		System.out.println(VariableOverrideTest.price);
		//����info����
		new VariableOverrideTest().info();
	}
	public void info()
	{
		//������ľֲ��������ֲ��������ǳ�Ա����
		String name = "�����";
		//ֱ�ӷ���name�����������name�ֲ�������ֵ��"�����"
		System.out.println(name);
		//ʹ��this����Ϊname�������޶���
		//�����priceʵ��Field��ֵ��"���"
		System.out.println(this.name);
	}
}

