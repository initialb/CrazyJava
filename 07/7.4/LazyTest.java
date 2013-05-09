
import java.util.*;
import static java.util.Calendar.*;
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
public class LazyTest
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.set(2003 , 7 , 31);  //2003-8-31
		// ���·���Ϊ9����9��31�ղ����ڡ�
		// ��������޸ģ�ϵͳ�����cal�Զ�������10��1�ա�
		cal.set(MONTH , 8);
		//����������10��1��
		//System.out.println(cal.getTime());    //��
		//����DATE�ֶ�Ϊ5
		cal.set(DATE , 5);    //��
		System.out.println(cal.getTime());    //��
	}
}
