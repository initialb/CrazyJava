
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
public class StartEnd 
{
	public static void main(String[] args)
	{
		//����һ��Pattern���󣬲���������һ��Matcher����
		String regStr = "Java is very easy!";
		System.out.println("Ŀ���ַ����ǣ�" + regStr);
		Matcher m = Pattern.compile("\\w+") 
			.matcher(regStr); 
		while(m.find())
		{
			System.out.println(m.group() + "�Ӵ�����ʼλ�ã�" 
				+ m.start() + "�������λ�ã�" + m.end()); 
		}
	} 
}
