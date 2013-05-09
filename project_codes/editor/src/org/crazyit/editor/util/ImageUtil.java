package org.crazyit.editor.util;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * ͼƬ������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class ImageUtil {
	
	//Ŀ¼�ر�ͼƬ
	public static String FOLDER_CLOSE = "images/folder-close.gif";
	//Ŀ¼��ͼƬ
	public static String FOLDER_OPEN = "images/folder-open.gif";
	//���ӽڵ���ļ�ͼƬ
	public static String FILE = "images/file.gif";
	//ʹ��ImageIO����ȡͼƬ
	public static Image getImage(String path) {
		try {
			return ImageIO.read(new File(path));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static ImageIcon getImageIcon(String path) {
		return new ImageIcon(getImage(path));
	}
}
