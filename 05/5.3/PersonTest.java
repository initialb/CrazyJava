

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
	//����һ��ʵ��Field
	public String name;
	//����һ����Field
	public static int eyeNum;
}
public class PersonTest
{
	public static void main(String[] args) 
	{
		//Person���Ѿ���ʼ���ˣ���eyeNum�����������ˣ����0
		System.out.println("Person��eyeNum��Fieldֵ:"
			+ Person.eyeNum);
		//����Person����
		Person p = new Person();
		//ͨ��Person���������p������Person����nameʵ��Field
		//��ͨ��ʵ������eyeNum��Field
		System.out.println("p������name Fieldֵ�ǣ�" + p.name 
			+ " p�����eyeNum Fieldֵ�ǣ�" + p.eyeNum);
		//ֱ��Ϊnameʵ��Field��ֵ
		p.name = "�����";
		//ͨ��p����eyeNum��Field����Ȼ�Ƿ���Person��eyeNum��Field
		p.eyeNum = 2;
		//�ٴ�ͨ��Person����������nameʵ��Field��eyeNum��Field
		System.out.println("p������name Fieldֵ�ǣ�" + p.name 
			+ " p�����eyeNum Fieldֵ�ǣ�" + p.eyeNum);
		//ǰ��ͨ��p�޸���Person��eyeNum���˴���Person.eyeNum�����2
		System.out.println("Person��eyeNum��Fieldֵ:" + Person.eyeNum);
		Person p2 = new Person();
		//p2���ʵ�eyeNum��Field��Ȼ����Person��ģ������Ȼ���2
		System.out.println("p2�����eyeNum��Fieldֵ:" + p2.eyeNum);
	}
}
