package org.crazyit.ball;

import java.io.IOException;

/**
 * ������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @author Kelvin Mak kelvin.mak125@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class Stick extends BallComponent {
	// ���嵵���ƶ����ٶ�
	public static final int SPEED = 20;
	// ���嵵���ʼ�ĳ���
	private int preWidth = 0;

	/**
	 * �в���������
	 * 
	 * @param panelWidth
	 *            int ������
	 * @param panelHeight
	 *            int ����߶�
	 * @param path
	 *            String ͼƬ·��
	 */
	public Stick(int panelWidth, int panelHeight, String path)
			throws IOException {
		// ���ø�������
		super(panelWidth, panelHeight, path);
		// ����y����
		this.setY(panelHeight - super.getImage().getHeight(null));
		// ����ԭ���ĳ���
		this.preWidth = super.getImage().getWidth(null);
	}

	/**
	 * ��ȡ��ʼ����
	 * 
	 * @return int ��ʼ����
	 */
	public int getPreWidth() {
		return this.preWidth;
	}

	/**
	 * ���ó�ʼ����
	 * 
	 * @return void
	 */
	public void setPreWidth(int preWidth) {
		this.preWidth = preWidth;
	}

}