
import java.util.*;
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
public class StringReg 
{
	public static void main(String[] args)
	{
		String[] msgs =
		{
			"Java has regular expressions in 1.4", 
			"regular expressions now expressing in Java", 
			"Java represses oracular expressions" 
		};
		for (String msg : msgs)
		{
			System.out.println(msg.replaceFirst("re\\w*" , "����:)"));
			System.out.println(Arrays.toString(msg.split(" ")));
		}
	} 
}
