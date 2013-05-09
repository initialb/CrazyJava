
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
public class ArrayDequeTest
{
	public static void main(String[] args) 
	{
		ArrayDeque stack = new ArrayDeque();
		//���ν�����Ԫ��push��"ջ"
		stack.push("���Java����");
		stack.push("������Java EE��ҵӦ��ʵս");
		stack.push("���Android����");
		//�����[���Java����, ������Java EE��ҵӦ��ʵս , ���Android����]
		System.out.println(stack);
		//���ʵ�һ��Ԫ�أ�����������pop��"ջ"����������Android����
		System.out.println(stack.peek());
		//��Ȼ�����[���Java����, ������Java EE��ҵӦ��ʵս , ���Android����]
		System.out.println(stack);
		//pop����һ��Ԫ�أ���������Android����
		System.out.println(stack.pop());
		//�����[���Java����, ������Java EE��ҵӦ��ʵս]
		System.out.println(stack);
	}
}
