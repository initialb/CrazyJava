

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
public class Primitive2Wrapper
{
	public static void main(String[] args) 
	{
		boolean bl = true;
		//ͨ����������b1�������ͱ�����װ�ɰ�װ�����
		Boolean blObj = new Boolean(bl);	
		int it = 5;
		//ͨ����������it�������ͱ�����װ�ɰ�װ�����
		Integer itObj = new Integer(it);
		//��һ���ַ���ת����Float����
		Float fl = new Float("4.56");
		//��һ���ַ���ת����Boolean����
		Boolean bObj = new Boolean("false");
		//�����������ʱ������java.lang.NumberFormatException�쳣
		//Long lObj = new Long("ddd");

		//ȡ��Boolean�������boolean����
		boolean bb = bObj.booleanValue();
		//ȡ��Integer�������int����
		int i = itObj.intValue();
		//ȡ��Float�������float����
		float f = fl.floatValue();
	}
}
