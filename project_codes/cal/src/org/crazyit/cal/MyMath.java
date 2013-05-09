package org.crazyit.cal;

import java.math.BigDecimal;

/**
 * ����������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @author Kelvin Mak kelvin.mak125@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class MyMath {
	// ����С����λ��
	public static final int DEFAULT_SCALE = 20;

	/**
	 * �ӷ�
	 * 
	 * @param num1
	 *            double
	 * @param num2
	 *            double
	 * @param reutrn
	 *            double ������ӵĽ��
	 */
	public static double add(double num1, double num2) {
		BigDecimal first = getBigDecimal(num1);
		BigDecimal second = getBigDecimal(num2);
		return first.add(second).doubleValue();
	}
	
	/**
	 * Ϊһ�����ִ���BigDecimal����
	 * @param number
	 * @return
	 */
	private static BigDecimal getBigDecimal(double number) {
		return new BigDecimal(number);
	}

	/**
	 * ����
	 * 
	 * @param num1
	 *            double
	 * @param num2
	 *            double
	 * @param reutrn
	 *            double ��������Ľ��
	 */
	public static double subtract(double num1, double num2) {
		BigDecimal first = getBigDecimal(num1);
		BigDecimal second = getBigDecimal(num2);
		return first.subtract(second).doubleValue();
	}

	/**
	 * �˷�
	 * 
	 * @param num1
	 *            double
	 * @param num2
	 *            double
	 * @param reutrn
	 *            double ������˵Ľ��
	 */
	public static double multiply(double num1, double num2) {
		BigDecimal first = getBigDecimal(num1);
		BigDecimal second = getBigDecimal(num2);
		return first.multiply(second).doubleValue();
	}

	/**
	 * ����
	 * 
	 * @param num1
	 *            double
	 * @param num2
	 *            double
	 * @param reutrn
	 *            double ��������Ľ��
	 */
	public static double divide(double num1, double num2) {
		BigDecimal first = getBigDecimal(num1);
		BigDecimal second = getBigDecimal(num2);
		return first.divide(second, DEFAULT_SCALE, BigDecimal.ROUND_HALF_UP)
				.doubleValue();
	}

}