

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
public class CommandTest
{
	public static void main(String[] args) 
	{
		ProcessArray pa = new ProcessArray();
		int[] target = {3, -4, 6, 4};
		//��һ�δ������飬���崦����Ϊȡ����PrintCommand
		pa.process(target , new PrintCommand());
		System.out.println("------------------");
		//�ڶ��δ������飬���崦����Ϊȡ����AddCommand
		pa.process(target , new AddCommand());
	}
}
