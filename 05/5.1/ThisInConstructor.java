

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
public class ThisInConstructor
{
	//����һ����Ϊfoo��Field
	public int foo;
	public ThisInConstructor()
	{
		//�ڹ������ﶨ��һ��foo����
		int foo = 0;
		//ʹ��this����˹��������г�ʼ���Ķ���
		//����Ĵ��뽫��Ѹմ��������foo Field����Ϊ6��
		this.foo = 6;
	}
	public static void main(String[] args)
	{
		//����ʹ��ThisInConstructor�����Ķ����foo Field
		//��������Ϊ6������������뽫���6��
		System.out.println(new ThisInConstructor().foo);
	}
}
