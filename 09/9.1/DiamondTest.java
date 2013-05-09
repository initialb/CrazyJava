
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
public class DiamondTest
{
	public static void main(String[] args) 
	{
		// Java�Զ��ƶϳ�ArrayList��<>��Ӧ����String
		List<String> books = new ArrayList<>();
		books.add("���Java����");
		books.add("���Android����");
		books.add("������Java EE��ҵӦ��ʵս");
		// ����ʱ����Ԫ�ؾ���String
		for (String book : books )
		{
			System.out.println(book);
		}
		//Java�Զ��ƶϳ�HashMap��<>��Ӧ����String , List<String>
		Map<String , List<String>> schoolsInfo = new HashMap<>();
		// Java�Զ��ƶϳ�ArrayList��<>��Ӧ����String
		List<String> schools = new ArrayList<>();
		schools.add("б�����Ƕ�");
		schools.add("����ȡ��·");
		schoolsInfo.put("�����" , schools);
		// ����Mapʱ��Map��key��String����
		for (String key : schoolsInfo.keySet())
		{
			// value��List<String>����
			List<String> list = schoolsInfo.get(key);
			System.out.println(key + "-->" + list);
		}
	}
}
