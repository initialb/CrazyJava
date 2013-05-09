
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
public class ForeachTest
{
	public static void main(String[] args) 
	{
		//����һ������
		Collection books = new HashSet();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���Android����"));
		for (Object obj : books)
		{
			//�˴���book����Ҳ���Ǽ���Ԫ�ر���
			String book = (String)obj;
			System.out.println(book);
			if (book.equals("���Android����"))
			{
				//������������ConcurrentModificationException�쳣
				books.remove(book);     //��
			}
		}
		System.out.println(books);
	}
}
