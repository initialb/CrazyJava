
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
public class EnumerationTest
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add("���Java����");
		v.add("������Java EE��ҵӦ��ʵս");
		Hashtable scores = new Hashtable();
		scores.put("����" , 78);
		scores.put("��ѧ" , 88);
		Enumeration em = v.elements();
		while (em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		Enumeration keyEm = scores.keys();
		while (keyEm.hasMoreElements())
		{
			Object key = keyEm.nextElement();
			System.out.println(key + "--->" 
				+ scores.get(key));
		}
	}
}
