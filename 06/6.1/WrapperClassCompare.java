

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
public class WrapperClassCompare
{
	public static void main(String[] args) 
	{
		Integer a = new Integer(6);
		//���true
		System.out.println("6�İ�װ��ʵ���Ƿ����5.0" + (a > 5.0));
		
		//���false
		System.out.println("�Ƚ�2����װ���ʵ���Ƿ���ȣ�" 
			+ (new Integer(2) == new Integer(2)));
		//ͨ���Զ�װ�䣬����ѻ�������ֵ��ֵ����װ���ʵ��
		Integer ina = 2;
		Integer inb = 2;
		//���true
		System.out.println("����2�Զ�װ����Ƿ���ȣ�" 
			+ (ina == inb));
		Integer biga = 128;
		Integer bigb = 128;
		//���false
		System.out.println("����128�Զ�װ����Ƿ���ȣ�"
			+ (biga == bigb));
	}
}
