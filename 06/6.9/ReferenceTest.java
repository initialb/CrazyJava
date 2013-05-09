
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
public class ReferenceTest
{
	public static void main(String[] args)
		throws Exception
	{
		//����һ���ַ�������
		String str = new String("���Java����");
		//����һ�������ã��ô����������õ�"���Java����"�ַ���
		WeakReference wr = new WeakReference(str);  //��
		//�ж�str���ú�"���Java����"�ַ���֮�������
		str = null;   //��
		//ȡ�������������õĶ���
		System.out.println(wr.get());  //��
		//ǿ����������
		System.gc();
		System.runFinalization();
		//�ٴ�ȡ�������������õĶ���
		System.out.println(wr.get());  //��
	}
}
