
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
public class GenericList
{
	public static void main(String[] args) 
	{
		// ����һ��ֻ�뱣���ַ�����List����
		List<String> strList = new ArrayList<String>();  // ��
		strList.add("���Java����");
		strList.add("���Android����");
		strList.add("������Java EE��ҵӦ��ʵս");
		// ������뽫����������
		strList.add(5);    // ��
		for (int i = 0; i < strList.size() ; i++ )
		{
			// �����������ǿ������ת��
			String str = strList.get(i);    // ��
		}
	}
}

