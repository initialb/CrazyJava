

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
public class Apple extends Fruit
{
	public static void main(String[] args) 
	{
		//����Apple�Ķ���
		Apple a = new Apple();
		//Apple������û��weight Field
		//��ΪApple�ĸ�����weight Field��Ҳ���Է���Apple�����Field
		a.weight = 56;
		//����Apple�����info����
		a.info();
	}
}
