

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
// ͨ��ʵ��Runnable�ӿ��������߳���
public class SecondThread implements Runnable
{
	private int i ;
	// run����ͬ�����߳�ִ����
	public void run()
	{
		for ( ; i < 100 ; i++ )
		{
			// ���߳���ʵ��Runnable�ӿ�ʱ��
			// ������ȡ��ǰ�̣߳�ֻ����Thread.currentThread()������
			System.out.println(Thread.currentThread().getName()
				+ "  " + i);
		}
	}
		
	public static void main(String[] args) 
	{
		for (int i = 0; i < 100;  i++)
		{
			System.out.println(Thread.currentThread().getName()
				+ "  " + i);
			if (i == 20)
			{
				SecondThread st = new SecondThread();     // ��
				// ͨ��new Thread(target , name)�����������߳�
				new Thread(st , "���߳�1").start();
				new Thread(st , "���߳�2").start();
			}
		}
	}
}

