

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
public class AddCommand implements Command
{
	public void process(int[] target)
	{
		int sum = 0;
		for (int tmp : target )
		{
			sum += tmp;
		}
		System.out.println("����Ԫ�ص��ܺ���:" + sum);
	}
}

