
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
public class IteratorTest
{
	public static void main(String[] args) 
	{
		//����һ������
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		//��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while(it.hasNext())
		{
			//it.next()�������ص�����������Object���ͣ�
			//��Ҫǿ������ת��
			String book = (String)it.next();
			System.out.println(book);
			if (book.equals("���Java����"))
			{
				//�Ӽ�����ɾ����һ��next�������ص�Ԫ��
				it.remove();
			}
			//��book������ֵ������ı伯��Ԫ�ر���
			book = "�����ַ���";   //��
		}
		System.out.println(books);
	}
}
