

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
class Apple
{
	private String color;
	private double weight;
	public Apple(){	}
	//�ṩ�в����Ĺ�����
	public Apple(String color , double weight)
	{
		this.color = color;
		this.weight = weight;
	}

	//color���Ե�setter��getter����
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}

	//weight���Ե�setter��getter����
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public double getWeight()
	{
		return this.weight;
	}

	//��дtoString����������ʵ��Apple�����"��������"
	public String toString()
	{
		return "һ��ƻ������ɫ�ǣ�" + color 
			+ "�������ǣ�" + weight;
	}
}
public class ToStringTest
{
	public static void main(String[] args) 
	{
		Apple a = new Apple("��ɫ" , 5.68);
		//��ӡApple����
		System.out.println(a);
	}
}
