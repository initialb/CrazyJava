
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
public class IdentityHashMapTest
{
	public static void main(String[] args) 
	{
		IdentityHashMap ihm = new IdentityHashMap();
		//�������д��뽫����IdentityHashMap�������������key-value��
		ihm.put(new String("����") , 89);
		ihm.put(new String("����") , 78);
		//�������д���ֻ����IdentityHashMap���������һ��key-value��
		ihm.put("java" , 93);
		ihm.put("java" , 98);
		System.out.println(ihm);
	}
}
