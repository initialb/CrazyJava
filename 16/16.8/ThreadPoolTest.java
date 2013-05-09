
import java.util.concurrent.*;
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

// ʵ��Runnable�ӿ�������һ���򵥵��߳���
class MyThread implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 100 ; i++ )
		{
			System.out.println(Thread.currentThread().getName()
				+ "��iֵΪ:" + i);
		}
	}
}
public class ThreadPoolTest
{
	public static void main(String[] args) 
		throws Exception
	{
		// ����һ�����й̶��߳�����6�����̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(6);
		// ���̳߳����ύ�����߳�
		pool.submit(new MyThread());
		pool.submit(new MyThread());
		// �ر��̳߳�
		pool.shutdown();
	}
}

