
import java.util.regex.*;
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
public class FindGroup 
{ 
	public static void main(String[] args)
	{
		//����һ��Pattern���󣬲���������һ��Matcher����
		Matcher m = Pattern.compile("\\w+") 
			.matcher("Java is very easy!"); 
		while(m.find())
		{
			System.out.println(m.group()); 
		}
		int i = 0;
		while(m.find(i))
		{ 
			System.out.print(m.group() + "\t"); 
			i++; 
		}
	}
}

