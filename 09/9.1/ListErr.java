
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
public class ListErr
{
	public static void main(String[] args) 
	{
		// ����һ��ֻ�뱣���ַ�����List����
		List strList = new ArrayList();
		strList.add("���Java����");
		strList.add("���Android����");
		strList.add("������Java EE��ҵӦ��ʵս");
		// "��С��"��һ��Integer����"����"�˼���
		strList.add(5);     // ��
		for (int i = 0; i < strList.size() ; i++ )
		{
			// ��ΪList��ȡ����ȫ����Object�����Ա���ǿ������ת��
			// ���һ��Ԫ�ؽ�����ClassCastException�쳣
			String str = (String)strList.get(i);   // ��
		}
	}
}
