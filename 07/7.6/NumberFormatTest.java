
import java.util.*;
import java.text.*;
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
public class NumberFormatTest
{
	public static void main(String[] args) 
	{
	//��Ҫ����ʽ��������
	double db = 1234000.567;
	//�����ĸ�Locale���ֱ�����й����ձ����¹�������
	Locale[] locales = {Locale.CHINA, Locale.JAPAN
		, Locale.GERMAN,  Locale.US};
	NumberFormat[] nf = new NumberFormat[12];
	//Ϊ�����ĸ�Locale����12��NumberFormat����
	//ÿ��Locale�ֱ���ͨ����ֵ��ʽ�����ٷֱȸ�ʽ�������Ҹ�ʽ��
	for (int i = 0 ; i < locales.length ; i++)
	{
		nf[i * 3] = NumberFormat.getNumberInstance(locales[i]);
		nf[i * 3 + 1] = NumberFormat.getPercentInstance(locales[i]);
		nf[i * 3 + 2] = NumberFormat.getCurrencyInstance(locales[i]);
	}
	for (int i = 0 ; i < locales.length ; i++)
	{
		switch (i)
		{
			case 0:
				System.out.println("-------�й��ĸ�ʽ--------");
				break;
			case 1:
				System.out.println("-------�ձ��ĸ�ʽ--------");
				break;	
			case 2:
				System.out.println("-------�¹��ĸ�ʽ--------");
				break;
			case 3:
				System.out.println("-------�����ĸ�ʽ--------");
				break;
			}
			System.out.println("ͨ����ֵ��ʽ��"
				+ nf[i * 3].format(db));
			System.out.println("�ٷֱ���ֵ��ʽ��"
				+ nf[i * 3 + 1].format(db));
			System.out.println("������ֵ��ʽ��"
				+ nf[i * 3 + 2].format(db));
		}
	}
}
