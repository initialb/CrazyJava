

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
public class InstanceofTest
{
	public static void main(String[] args) 
	{
		//����helloʱʹ��Object�࣬��hello�ı���������Object��
		//Object��������ĸ��� , ��hello������ʵ��������String
		Object hello = "Hello";
		//String��Object������࣬���Խ���instanceof���㡣����true��
		System.out.println("�ַ����Ƿ���Object���ʵ����"
			+ (hello instanceof Object));
		//����true��
		System.out.println("�ַ����Ƿ���String���ʵ����" 
			+ (hello instanceof String));
		//Math��Object������࣬���Խ���instanceof���㡣����false��
		System.out.println("�ַ����Ƿ���Math���ʵ����" 
			+ (hello instanceof Math));
		//Stringʵ����Comparable�ӿڣ����Է���true��
		System.out.println("�ַ����Ƿ���Comparable�ӿڵ�ʵ����" 
			+ (hello instanceof Comparable));
		String a = "Hello";
		//String��Ȳ���Math�࣬Ҳ����Math��ĸ��࣬
		//���������������޷�ͨ��
		System.out.println("�ַ����Ƿ���Math���ʵ����"
			+ (a instanceof Math));
	}
}
