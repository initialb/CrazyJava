
import java.lang.ref.*;
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
public class PhantomReferenceTest
{
	public static void main(String[] args) 
		throws Exception
	{
		//����һ���ַ�������
		String str = new String("���Java����");
		//����һ�����ö���
		ReferenceQueue rq = new ReferenceQueue();
		//����һ�������ã��ô����������õ�"���Java����"�ַ���
		PhantomReference pr = new PhantomReference (str , rq);
		//�ж�str���ú�"���Java����"�ַ���֮�������
		str = null;
		//ȡ�������������õĶ���
		//������ͨ�������÷��ʱ����õĶ������Դ˴����null
		System.out.println(pr.get());  //��
		//ǿ����������
		System.gc();
		System.runFinalization();
		//��������֮�������ý����������ö�����
		//ȡ�����ö��������Ƚ�������е�������pr���бȽ�
		System.out.println(rq.poll() == pr);   //��
	}
}
