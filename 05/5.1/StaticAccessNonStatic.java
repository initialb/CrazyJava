

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
public class StaticAccessNonStatic
{
	public void info()
	{
		System.out.println("�򵥵�info����");
	}
	public static void main(String[] args) 
	{
		//��Ϊmain�����Ǿ�̬��������info�ǷǾ�̬������
		//����main�������Ǹ��౾�������Ǹ����ʵ����
		//���ʡ�Ե�this�޷�ָ����Ч�Ķ���
		info();
	}
}
