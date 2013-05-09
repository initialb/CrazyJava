
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
enum Season
{
	SPRING,SUMMER,FALL,WINTER
}
public class EnumMapTest
{
	public static void main(String[] args) 
	{
		//����һ��EnumMap���󣬸�EnumMap������key
		//������Seasonö�����ö��ֵ
		EnumMap enumMap = new EnumMap(Season.class);
		enumMap.put(Season.SUMMER , "��������");
		enumMap.put(Season.SPRING , "��ů����");
		System.out.println(enumMap);
	}
}
