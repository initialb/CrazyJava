
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
public class ScannerLongTest
{
	public static void main(String[] args)
	{
		//System.in�����׼���룬���Ǽ�������
		Scanner sc = new Scanner(System.in);
		//�ж��Ƿ�����һ��long����
		while(sc.hasNextLong())
		{
			//���������
			System.out.println("��������������ǣ�"
				+ sc.nextLong());
		}
	}
}
