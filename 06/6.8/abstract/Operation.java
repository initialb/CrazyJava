

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
public enum Operation
{
	PLUS, MINUS, TIMES, DIVIDE;
	//Ϊö���ඨ��һ������������ʵ�ֲ�ͬ������
	double eval(double x, double y)
	{
		switch(this) 
		{
			case PLUS: return x + y;
			case MINUS: return x - y;
			case TIMES: return x * y;
			case DIVIDE: return x / y;
			default: return 0;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(Operation.PLUS.eval(3, 4));
		System.out.println(Operation.MINUS.eval(5, 4));
		System.out.println(Operation.TIMES.eval(5, 4));
		System.out.println(Operation.DIVIDE.eval(5, 4));
	}
}
