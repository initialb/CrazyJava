
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
public class PriorityQueueTest
{
	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue();
		//�������������pq�м����ĸ�Ԫ��
		pq.offer(6);
		pq.offer(-3);
		pq.offer(9);
		pq.offer(0);
		//���pq���У������ǰ�Ԫ�صļ���˳�����У�
		//���ǰ�Ԫ�صĴ�С˳�����У����[-3, 0, 9, 6]
		System.out.println(pq);
		//���ʶ��е�һ��Ԫ�أ���ʵ���Ƕ�������С��Ԫ�أ�-3
		System.out.println(pq.poll());
	}
}
