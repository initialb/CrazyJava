
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

class Z implements Comparable
{
	int age;
	public Z(int age)
	{
		this.age = age;
	}
	// ��дequals()���������Ƿ���true
	public boolean equals(Object obj)
	{
		return true;
	}
	//��д��compareTo(Object obj)���������Ƿ���������
	public int compareTo(Object obj)
	{
		return 1;
	}
}
public class TreeSetTest2
{
	public static void main(String[] args) 
	{
		TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);
		//���true��������ӳɹ�
		System.out.println(set.add(z1));    //��
		//�������set���ϣ�������������Ԫ��
		System.out.println(set);
		//�޸�set���ϵĵ�һ��Ԫ�ص�age����
		 ((Z)(set.first())).age = 9;
		//���set���ϵ����һ��Ԫ�ص�age������������Ҳ�����9
		System.out.println(((Z)(set.last())).age);
	}
}
