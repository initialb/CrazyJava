
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

// �Զ���һ��StrList�����࣬ʹ����ϵķ�ʽ������ArrayList��
class StrList
{
	private List strList = new ArrayList();
	// ����StrList��add����
	public boolean add(String ele)
	{
		return strList.add(ele);
	}
	// ��дget��������get�����ķ���ֵ���͸�ΪString����
	public String get(int index)
	{
		return (String)strList.get(index);
	}
	public int size()
	{
		return strList.size();
	}
}
public class CheckType
{
	public static void main(String[] args) 
	{
		// ����һ��ֻ�뱣���ַ�����List����
		StrList strList = new StrList();
		strList.add("���Java����");
		strList.add("���Android����");
		strList.add("������Java EE��ҵӦ��ʵս");
		// ������䲻�ܰ�Integer���󡰶�����������,������������
		strList.add(5);     // ��
		System.out.println(strList);
		for (int i = 0; i < strList.size() ; i++ )
		{
			// ��ΪStrList��Ԫ�ص����;���String���ͣ�
			// ��������ǿ������ת��
			String str = strList.get(i);
		}
	}
}
