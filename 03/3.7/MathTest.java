

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
public class MathTest
{
	public static void main(String[] args) 
	{
		//�������aΪ3.2
		double a = 3.2;
		//��a��5�η���������������Ϊb��
		double b = Math.pow(a , 5);
		//���b��ֵ
		System.out.println(b);
		//��a��ƽ�����������������c
		double c = Math.sqrt(a);
		//���c��ֵ
		System.out.println(c);
		//���������,����һ��0��1֮���α�������
		double d = Math.random();
		//��������d��ֵ
		System.out.println(d);
		//��1.57��sin����ֵ��1.57�����ɻ�����
		double e = Math.sin(1.57);
		//����ӽ�1
		System.out.println(e);
	}
}
