package org.crazyit.book.commons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

import javax.imageio.ImageIO;

public class ImageUtil {
	
	//ѹ��ͼƬ������
	public final static int MAX_WIDTH = 220;
	//ѹ��ͼƬ������
	public final static int MAX_HEIGHT = 240;
	/** 
	  * ����ԭͼƬ��ѹ����, ����һ���µ�ͼƬ 
	  * @param imageFile ͼƬ�ļ�
	  * @param url ԭͼ���·��
	  * @param formatName ����ͼƬ�ĸ�ʽ
	  * @param compress �Ƿ����ѹ��
	  * @return ���ɵ�ͼƬ�ļ�
	  */
	public static File makeImage(File imageFile, String url, String formatName, 
			boolean compress) {
		try {
			File output = new File(url);
			//��ȡͼƬ
			BufferedImage bi = ImageIO.read(imageFile);
			//���������ѹ��, ֱ��д���ļ�������
			if (!compress) {
				ImageIO.write(bi, formatName, new FileOutputStream(output));
				return output;
			}
			Image newImage = getImage(bi);
			//��ȡѹ����ͼƬ�ĸߺͿ�
			int height = newImage.getHeight(null);
			int width = newImage.getWidth(null);
			//���µĸߺͿ���һ���µĻ���ͼƬ
			BufferedImage bi2 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics g = bi2.getGraphics();
			//���µĻ���ͼƬ�л�ͼ
			g.drawImage(newImage, 0, 0, null);
			//������ļ�
			ImageIO.write(bi2, formatName, new FileOutputStream(output));
			return output;
		} catch (IOException e) {
			throw new UploadException("�ϴ��ļ��쳣");
		}
	}
	
	//����һ��Image���󣬵�����bi�Ŀ�ȸߴ��ʱ��ʹ�����Ŀ���ѹ��ͼƬ��
	//������bi�ĸ߱ȿ���ʱ��ʹ�����ĸ���ѹ��ͼƬ
	private static Image getImage(BufferedImage bi) {
		if (bi.getWidth() > bi.getHeight()) {
			return bi.getScaledInstance(MAX_WIDTH, -10, Image.SCALE_AREA_AVERAGING);
		} else {
			return bi.getScaledInstance(-10, MAX_HEIGHT, Image.SCALE_AREA_AVERAGING);
		}
	}
	
	//����uuid����Ϊ�ϴ����ļ���
	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
}
