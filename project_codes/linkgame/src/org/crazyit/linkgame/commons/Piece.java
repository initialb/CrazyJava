package org.crazyit.linkgame.commons;

import java.awt.image.BufferedImage;

/**
 * ��������Ϸ�еķ������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class Piece {
	// ���淽����������Ӧ��ͼƬ
	private BufferedImage image;

	// ��ʼ���x����
	private int beginX;

	// ��ʼ���y����
	private int beginY;

	// �������x����
	private int endX;

	// �������y����
	private int endY;

	// �ö�����������һά��λ��
	private int indexX;

	// �ö����������ж�ά��λ��
	private int indexY;

	// ֻ���ø�Piece���������������е�λ��
	public Piece(int indexX, int indexY) {
		this.indexX = indexX;
		this.indexY = indexY;
	}

	// ͨ�������������������
	public Piece(int beginX, int beginY, int indexX, int indexY,
			BufferedImage image) {
		this.beginX = beginX;
		this.beginY = beginY;
		this.indexX = indexX;
		this.indexY = indexY;
		this.image = image;
		this.endX = beginX + image.getWidth();
		this.endY = beginY + image.getHeight();
	}

	public int getIndexX() {
		return indexX;
	}

	public int getIndexY() {
		return indexY;
	}

	public int getBeginX() {
		return beginX;
	}

	public int getBeginY() {
		return beginY;
	}

	public int getEndX() {
		return endX;
	}

	public int getEndY() {
		return endY;
	}

	public BufferedImage getImage() {
		return image;
	}

	/**
	 * �Ƿ�ΪͼƬ��ͬ������Piece, �жϱ�׼Ϊ����Piece��ͼƬ�Ƿ���ͬ
	 * 
	 * @param piece
	 * @return true ����PieceͼƬ��ͬ false ����PieceͼƬ����ͬ
	 */
	public boolean isSameImage(Piece piece) {
		// ���ͼƬ��ͬ, ����true
		if (this.image.equals(piece.getImage())) {
			return true;
		}
		return false;
	}
}
