

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
public class GenderTest
{
	public static void main(String[] args) 
	{
		//ͨ��Enum��valueOf��������ȡָ��ö�����ö��ֵ
		Gender g = Enum.valueOf(Gender.class , "FEMALE");
		//ֱ��Ϊö��ֵ��Field��ֵ
		g.name = "Ů";
		//ֱ�ӷ���ö��ֵ��Fieldֵ
		System.out.println(g + "����:" + g.name);
	}
}
