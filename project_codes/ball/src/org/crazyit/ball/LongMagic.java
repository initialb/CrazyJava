package org.crazyit.ball;

import java.io.IOException;

/**
 * ʹ����䳤�ĵ���
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @author Kelvin Mak kelvin.mak125@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class LongMagic extends Magic {
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
	public LongMagic(String path, int x, int y) throws IOException {
		super(path, x, y);
	}

	/**
	 * ���ߵĹ��� : ����䳤
	 * 
	 * @param stitck
	 *            Stick
	 * @return void
	 */
	public void magicDo(Stick stick) {
		double imageWidth = stick.getImage().getWidth(null);
		// �������û�б䳤��
		if (stick.getPreWidth() <= imageWidth) {
			// ������ĳ��ȸ�Ϊ˫��
			stick.setPreWidth((int) (stick.getPreWidth() * 2));
		}
	}
}