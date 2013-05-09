
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
public class HelloArg
{
	public static void main(String[] args)
	{
		//����һ��Locale����
		Locale currentLocale = null;
		//������г����ָ������������
		if (args.length == 2)
		{
			//ʹ�����г����������������Localeʵ��
			currentLocale = new Locale(args[0] , args[1]);
		}
		else
		{
			//����ֱ��ʹ��ϵͳĬ�ϵ�Locale
			currentLocale = Locale.getDefault();
		}
		//����Locale����������Դ
		ResourceBundle bundle = ResourceBundle
			.getBundle("myMess" , currentLocale);
		//ȡ���Ѽ��ص�������Դ�ļ���msg��Ӧ��Ϣ
		String msg = bundle.getString("msg");
		//ʹ��MessageFormatΪ��ռλ�����ַ����������
		System.out.println(MessageFormat.format(msg
			, "yeeku" , new Date()));
	}
}
