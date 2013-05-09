
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
public class PerformanceTest
{
	public static void main(String[] args) 
	{
		//����һ���ַ�������
		String[] tst1 = new String[900000];
		//��̬��ʼ������Ԫ��
		for (int i = 0; i < 900000; i++)
		{
			tst1[i] = String.valueOf(i);
		}
		ArrayList al = new ArrayList();
		//����������Ԫ�ؼ���ArrayList������
		for (int i = 0; i < 900000 ; i++)
		{
			al.add(tst1[i]);
		}
		LinkedList ll = new LinkedList();
		//����������Ԫ�ؼ���LinkedList������
		for (int i = 0; i < 900000 ; i++)
		{
			ll.add(tst1[i]);
		}
		//��������ArrayList���ϵ�����Ԫ�أ����������ʱ��
		long start = System.currentTimeMillis();
		for (Iterator it = al.iterator();it.hasNext() ; )
		{
			it.next();
		}
		System.out.println("����ArrayList����Ԫ�ص�ʱ��:" 
			+ (System.currentTimeMillis() - start));
		//��������LinkedList���ϵ�����Ԫ�أ����������ʱ��
		start = System.currentTimeMillis();
		for (Iterator it = ll.iterator();it.hasNext() ; )
		{
			it.next();
		}
		System.out.println("����LinedList����Ԫ�ص�ʱ��:"
			+ (System.currentTimeMillis() - start));
	}
} 

