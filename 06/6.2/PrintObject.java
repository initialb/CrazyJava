

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
class Person
{
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
	public void info()
	{
		System.out.println("������Ϊ��" + name);
	}
}
public class PrintObject
{
	public static void main(String[] args) 
	{
		//����һ��Person���󣬽�֮����p����
		Person p = new Person("�����");
		//��ӡp�����õ�Person����
		System.out.println(p);
	}
}

