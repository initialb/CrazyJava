

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
public class BitOperatorTest
{
	public static void main(String[] args) 
	{
		//�����1
		System.out.println(5 & 9);
		//�����13
		System.out.println(5 | 9);
		//�����4
		System.out.println(~-5);
		//�����12
		System.out.println(5 ^ 9);
		//���20
		System.out.println(5 << 2);
		//���-20
		System.out.println(-5 << 2);
		//���-2
		System.out.println(-5 >> 2);
		//���1073741822
		System.out.println(-5 >>> 2);
	}
}
