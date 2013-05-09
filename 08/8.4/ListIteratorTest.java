
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
public class ListIteratorTest
{
	public static void main(String[] args) 
	{
		String[] books = {
			"���Java����",
			"������Java EE��ҵӦ��ʵս"
		};
		List bookList = new ArrayList();
		for (int i = 0; i < books.length ; i++ )
		{
			bookList.add(books[i]);
		}
		ListIterator lit = bookList.listIterator();
		while (lit.hasNext())
		{
			System.out.println(lit.next());
			lit.add("-------�ָ���-------");
		}
		System.out.println("=======���濪ʼ�������=======");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}
}
