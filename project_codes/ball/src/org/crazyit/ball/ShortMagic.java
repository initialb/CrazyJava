package org.crazyit.ball;

import java.io.IOException;

/**
 * ʹ�����̵ĵ���
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @author Kelvin Mak kelvin.mak125@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class ShortMagic extends Magic {
	/**
	 * ������
	 * 
	 * @param path
	 *            String �ļ�·��
	 * @param x
	 *            int x����
	 * @param y
	 *            int y����
	 */
	public ShortMagic(String path, int x, int y) throws IOException {
		super(path, x, y);
	}

	/**
	 * ���ߵĹ��� : ������
	 * 
	 * @param stitck
	 *            Stick
	 * @return void
	 */
	public void magicDo(Stick stick) {
		double imageWidth = stick.getImage().getWidth(null);
		// �������û�б�̹�
		if (stick.getPreWidth() >= imageWidth) {
			// ������Ŀ�ȸ�Ϊһ��
			stick.setPreWidth((int) (stick.getPreWidth() * 0.5));
		}
	}
}