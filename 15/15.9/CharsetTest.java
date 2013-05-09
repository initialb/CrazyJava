
import java.nio.charset.*;
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
public class CharsetTest
{
	public static void main(String[] args) 
	{
		// ��ȡJava֧�ֵ�ȫ���ַ���
		SortedMap<String,Charset>  map = Charset.availableCharsets();
		for (String alias : map.keySet())
		{
			// ����ַ����ı����Ͷ�Ӧ��Charset����
			System.out.println(alias + "----->" 
				+ map.get(alias));
		}
	}
}
