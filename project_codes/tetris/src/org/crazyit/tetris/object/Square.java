package org.crazyit.tetris.object;

import java.awt.Image;

/**
 * һ���������
 * @author yangenxiong
 *
 */
public class Square {

	//�����ͼƬ
	private Image image;
	//��ʼ������
	private int beginX;
	//��ʼ������
	private int beginY;
	
	public Square(Image image, int beginX, int beginY) {
		this.image = image;
		this.beginX = beginX;
		this.beginY = beginY;
	}
	
	public Square(int beginX, int beginY) {
		this.beginX = beginX;
		this.beginY = beginY;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
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
	
	public boolean equals(Object obj) {
		if (obj instanceof Square) {
			Square s = (Square)obj;
			if ((s.getBeginX() == this.getBeginX() && (s.getBeginY() == this.getBeginY()))) {
				return true;
			}
		}
		return false;
	}
	
}
