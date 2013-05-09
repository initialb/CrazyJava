

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
public class EnumTest
{
	public void judge(SeasonEnum s)
	{
		//switch�����ı��ʽ������ö��ֵ
		switch (s)
		{
			case SPRING:
				System.out.println("��ů����������̤��");
				break;
			case SUMMER:
				System.out.println("�������ף��ʺ���Ӿ");
				break;
			case FALL:
				System.out.println("�����ˬ��������ʱ");
				break;
			case WINTER:
				System.out.println("����ѩƮ��Χ¯��ѩ");
				break;
		}
	}
	public static void main(String[] args)
	{
		//����ö���඼��һ��values���������ظ�ö���������ʵ��
		for (SeasonEnum s : SeasonEnum.values())
		{
			System.out.println(s);
		}
		//ƽ��ʹ��ö��ʵ��ʱ��
		//����ͨ��EnumClass.variable��ʽ������
		new EnumTest().judge(SeasonEnum.SPRING);
	}
}
