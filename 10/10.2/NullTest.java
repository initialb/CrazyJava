
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
public class NullTest
{
	public static void main(String[] args) 
	{
		Date d = null;
		try
		{
			System.out.println(d.after(new Date()));
		}
		catch (NullPointerException ne)
		{
			System.out.println("��ָ���쳣");
		}
		catch(Exception e)
		{
			System.out.println("δ֪�쳣");
		}
	}
}
