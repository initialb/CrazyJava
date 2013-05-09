

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
public abstract class SpeedMeter
{
	//ת��
	private double turnRate;
	public SpeedMeter()
	{
	}
	//�ѷ��س��ְ뾶�ķ�������ɳ��󷽷�
	public abstract double getRadius();
	public void setTurnRate(double turnRate)
	{
		this.turnRate = turnRate;
	}
	//��������ٶȵ�ͨ���㷨
	public double getSpeed()
	{
		//�ٶȵ��� ���ְ뾶 * 2 * PI * ת��
		return java.lang.Math.PI * 2 * getRadius() * turnRate;
	}
}
