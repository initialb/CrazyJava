

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
public class A1 extends Apple<String>
{
	// ��ȷ��д�˸���ķ���������ֵ
	// �븸��Apple<String>�ķ���ֵ��ȫ��ͬ
	public String getInfo()
	{
		return "����" + super.getInfo();
	}
	/*
	// ���淽���Ǵ���ģ���д���෽��ʱ����ֵ���Ͳ�һ��
	public Object getInfo()
	{
		return "����";
	}
	*/
}

