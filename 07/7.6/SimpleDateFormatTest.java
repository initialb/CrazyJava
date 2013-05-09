
import java.text.*;
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
public class SimpleDateFormatTest
{
	public static void main(String[] args)
		throws ParseException
	{
		Date d = new Date();
		//����һ��SimpleDateFormat����
		SimpleDateFormat sdf1 = new SimpleDateFormat("Gyyyy���е�D��");
		//��d��ʽ�������ڣ��������Ԫ2007���е�354��
		String dateStr = sdf1.format(d);
		System.out.println(dateStr);
		//һ���ǳ�����������ַ���
		String str = "07###����##21";
		SimpleDateFormat sdf2 = new SimpleDateFormat("y###MMM##d");
		//�������ַ������������ڣ������Wed Mar 21 00:00:00 CST 2007
		System.out.println(sdf2.parse(str));
	}
}

