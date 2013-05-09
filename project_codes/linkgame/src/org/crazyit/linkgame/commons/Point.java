package org.crazyit.linkgame.commons;

/**
 * ���ӵ����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class Point {
	// ��¼���������x����
	private int x;

	// ��¼���������y����
	private int y;

	// �ṩ������
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// ������Ҫ��дObject��equals����, �����ж��������Ƿ�Ϊͬһ��
	public boolean equals(Object object) {
		// ���object��Point����
		if (object instanceof Point) {
			// ������ǿ��ת��Point����
			Point p = (Point) object;
			// ������Point�����x�����y����ͬʱ��ȵ�ʱ��, ��ʾ������ͬһ����
			return (p.getX() == this.x && p.getY() == this.y) ? true : false;
		}
		return false;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
