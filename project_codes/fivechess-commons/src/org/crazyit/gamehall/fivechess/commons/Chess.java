package org.crazyit.gamehall.fivechess.commons;

import java.awt.Rectangle;

/**
 * �����������е�һ�����Ӷ���
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class Chess {

	//���ӵĿ�ʼX����
	private int beginX;

	//���ӵĿ�ʼY����
	private int beginY;
	
	//�ڶ�ά�����е�һάֵ
	private int i;
	
	//�ڶ�ά�����еĶ�άֵ
	private int j;
	
	//������ɫ
	private String color;
	
	//�����ӵ�����
	private Rectangle range;
	
	public final static String BLACK = "black";
	
	public final static String WHITE = "white";
	
	//����ͼƬ�Ŀ�͸�
	public final static int IMAGE_WIDTH = 33;
	
	public final static int IMAGE_HEIGHT = 33;
	
	//���̵ĺ����С
	public final static int CHESS_BOARD_X_SIZE = 15;
	
	//���̵������С
	public final static int CHESS_BOARD_Y_SYZE = 15;

	//�ͻ���ʹ�õĹ�����, ��Ҫһ�����ӵĿ�ʼ����
	public Chess(int beginX, int beginY, int i, int j, String color) {
		this.beginX = beginX;
		this.beginY = beginY;
		this.i = i;
		this.j = j;
		this.color = color;
		this.range = new Rectangle(beginX, beginY, IMAGE_WIDTH, IMAGE_HEIGHT);
	}
	
	//��������ʹ�õĹ�����, ������Ҫ���ӵ�����
	public Chess(int i, int j, String color) {
		this.i = i;
		this.j = j;
		this.color = color;
	}
	
	public int getI() {
		return this.i;
	}
	
	public int getJ() {
		return this.j;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public void setJ(int j) {
		this.j = j;
	}

	public int getBeginX() {
		return beginX;
	}

	public void setBeginX(int beginX) {
		this.beginX = beginX;
	}

	public int getBeginY() {
		return beginY;
	}

	public void setBeginY(int beginY) {
		this.beginY = beginY;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Rectangle getRange() {
		return this.range;
	}
}
