
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
public class NullInHashMap
{
	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		//��ͼ������keyΪnull��key-value�Է���HashMap��
		hm.put(null , null);
		hm.put(null , null);    //��
		//��һ��valueΪnull��key-value�Է���HashMap��
		hm.put("a" , null);    //��
		//���Map����
		System.out.println(hm);
	}
}
