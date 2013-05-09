

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
public class MultiExceptionTest
{
	public static void main(String[] args) 
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("�����������������Ľ���ǣ�" + c );
		}
		catch (IndexOutOfBoundsException|NumberFormatException
			|ArithmeticException ie)
		{
			System.out.println("������������Խ�硢���ָ�ʽ�쳣�������쳣֮һ");
			// ��׽���쳣ʱ���쳣����Ĭ����final���Σ�
			// ������������д�
			ie = new ArithmeticException("test");  //��
		}
		catch (Exception e)
		{
			System.out.println("δ֪�쳣");
			// ��׽һ�����͵��쳣ʱ���쳣����û��final����
			// �������������ȫ��ȷ��
			e = new RuntimeException("test");    //��
		}
	}
}

