

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
public class FinalVariableTest
{
	//�����Ա����ʱָ��Ĭ��ֵ���Ϸ���
	final int a = 6;
	//����������ڹ��������ʼ�����з����ʼֵ
	final String str;
	final int c;
	final static double d;
	//��û��ָ��Ĭ��ֵ����û���ڳ�ʼ���顢��������ָ����ʼֵ��
	//���涨��char Field�ǲ��Ϸ��ġ�
	//final char ch;
	//��ʼ���飬�ɶ�û��ָ��Ĭ��ֵ��ʵ��Fieldָ����ʼֵ
	{
		//�ڳ�ʼ������Ϊʵ��Fieldָ����ʼֵ���Ϸ�
		str = "Hello";
		//����a Fieldʱ�Ѿ�ָ����Ĭ��ֵ��
		//����Ϊa���¸�ֵ���渳ֵ���Ƿ�
		//a = 9;
	}
	//��̬��ʼ���飬�ɶ�û��ָ��Ĭ��ֵ����Fieldָ����ʼֵ
	static
	{
		//�ھ�̬��ʼ������Ϊ��Fieldָ����ʼֵ���Ϸ�
		d = 5.6;
	}
	//���������ɶԼ�û��ָ��Ĭ��ֵ����û���ڳ�ʼ������
	//ָ����ʼֵ��ʵ��Fieldָ����ʼֵ
	public FinalVariableTest()
	{
		//�����ʼ�����ж�strָ���˳�ʼ��ֵ��
		//�������в��ܶ�final�������¸�ֵ�����渳ֵ���Ƿ�
		//str = "java";
		c = 5;
	}
	public void changeFinal()
	{
		//��ͨ��������Ϊfinal���εĳ�Ա������ֵ
		//d = 1.2;
		//��������ͨ������Ϊfinal��Ա����ָ����ʼֵ
		//ch = 'a';
	}
	public static void main(String[] args) 
	{
		FinalVariableTest ft = new FinalVariableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(ft.d);
	}
}
