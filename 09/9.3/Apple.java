

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
public class Apple<T extends Number>
{
	T col;
	public static void main(String[] args)
	{
		Apple<Integer> ai = new Apple<>();
		Apple<Double> ad = new Apple<>();
		// ������뽫��������쳣�����������ͼ��String���ʹ���T�β�
		// ��String����Number�������ͣ����������������
		Apple<String> as = new Apple<>();		//��
	}
}
