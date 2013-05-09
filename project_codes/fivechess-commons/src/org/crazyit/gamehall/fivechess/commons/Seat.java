package org.crazyit.gamehall.fivechess.commons;

import java.awt.Rectangle;

/**
 * ���ӵ���λ����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class Seat {
	
	//����λ�����
	private ChessUser user;
	
	//��λ�����귶Χ
	private Rectangle range;
	
	//��λ��
	private String side;

	//��λ���
	public final static int SEAT_WIDTH = 30;
	
	//��λ�߶�
	public final static int SEAT_HEIGHT = 30;

	public final static String LEFT = "left";
	
	public final static String RIGHT = "right";
	
	public Seat(ChessUser user, Rectangle range, String side) {
		this.user = user;
		this.range = range;
		this.side = side;
	}

	public ChessUser getUser() {
		return user;
	}

	public void setUser(ChessUser user) {
		this.user = user;
	}

	public Rectangle getRange() {
		return range;
	}

	public void setRange(Rectangle range) {
		this.range = range;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

}
