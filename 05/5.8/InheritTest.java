

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
class Animal
{
	private void beat()
	{
		System.out.println("��������...");
	}
	public void breath()
	{
		beat();
		System.out.println("��һ��������һ������������...");
	}
}
//�̳�Animal��ֱ�Ӹ��ø����breath����
class Bird extends Animal
{
	public void fly()
	{
		System.out.println("����������ڵķ���...");
	}
}
//�̳�Animal��ֱ�Ӹ��ø����breath����
class Wolf extends Animal
{
	public void run()
	{
		System.out.println("����½���ϵĿ��ٱ���...");
	}
}
public class InheritTest
{
	public static void main(String[] args)
	{
		Bird b = new Bird();
		b.breath();
		b.fly();
		Wolf w = new Wolf();
		w.breath();
		w.run();
	}
}
