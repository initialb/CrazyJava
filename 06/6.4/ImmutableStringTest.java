

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
public class ImmutableStringTest
{
	public static void main(String[] args) 
	{
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		//���false
		System.out.println(str1 == str2);
		//���true
		System.out.println(str1.equals(str2));
		//�������������hashCode��ͬ
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
