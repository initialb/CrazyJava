

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
public class Outer
{
	private int outProp = 9;
	class Inner
	{
		private int inProp = 5;
		public void acessOuterProp()
		{
			//�Ǿ�̬�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա
			System.out.println("�ⲿ���outPropֵ:"
				+ outProp);
		}
	}
	public void accessInnerProp()
	{
		//�ⲿ�಻��ֱ�ӷ��ʷǾ�̬�ڲ����ʵ��Field,
		//���������ֱ������
		//System.out.println("�ڲ����inPropֵ:" + inProp);
		//��������ڲ����ʵ��Field��������ʽ�����ڲ������
		System.out.println("�ڲ����inPropֵ:" 
			+ new Inner().inProp);
	}
	public static void main(String[] args)
	{
		//ִ��������룬ֻ�������ⲿ����󣬻�δ�����ڲ������
		Outer out = new Outer();      //��
		out.accessInnerProp();
	}
}
