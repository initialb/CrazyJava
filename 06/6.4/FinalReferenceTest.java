
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
class Person
{
	private int age;
	public Person(){}
	//�в���������
	public Person(int age)
	{
		this.age = age;
	}
	//ʡ��age Field��setter��getter����
	//age Field��setter��getter����
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
}
public class FinalReferenceTest
{
	public static void main(String[] args) 
	{
		//final�������������iArr��һ�����ñ���
		final int[] iArr = {5, 6, 12, 9};
		System.out.println(Arrays.toString(iArr));
		//������Ԫ�ؽ������򣬺Ϸ�
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		//������Ԫ�ظ�ֵ���Ϸ�
		iArr[2] = -8;
		System.out.println(Arrays.toString(iArr));
		//��������iArr���¸�ֵ���Ƿ�
		//iArr = null;
		//final����Person������p��һ�����ñ���
		final Person p = new Person(45);
		//�ı�Person�����age Field���Ϸ�
		p.setAge(23);
		System.out.println(p.getAge());
		//��������p���¸�ֵ���Ƿ�
		//p = null;
	}
}