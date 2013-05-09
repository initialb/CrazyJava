
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
public class UnmodifiableTest
{
	public static void main(String[] args)
	{
		//����һ���յġ����ɸı��List����
		List unmodifiableList = Collections.emptyList();
		//����һ��ֻ��һ��Ԫ�أ��Ҳ��ɸı��Set����
		Set unmodifiableSet = Collections.singleton("���Java����");
		//����һ����ͨMap����
		Map scores = new HashMap();
		scores.put("����" , 80);
		scores.put("Java" , 82);
		//������ͨMap�����Ӧ�Ĳ��ɱ�汾
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		//��������һ�д��붼������UnsupportedOperationException�쳣
		unmodifiableList.add("����Ԫ��");   //��
		unmodifiableSet.add("����Ԫ��");   //��
		unmodifiableMap.put("����" , 90);   //��
	}
}

