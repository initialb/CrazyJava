

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
public class Fruit
{
	public void info()
	{ 
		System.out.println("ˮ����info����...");
	}
}
class Apple extends Fruit
{
	// ʹ��@Overrideָ�����淽��������д���෽��
	@Override 
	public void inf0()
	{
		System.out.println("ƻ����дˮ����info����...");
	}
}
