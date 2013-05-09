package org.crazyit.flashget.util;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageUtil {

	//����ڵ�ͼƬ
	public static final ImageIcon TASK_NODE_IMAGE = new ImageIcon("images/nav/flashget.gif");
	
	//������ɽڵ�ͼƬ
	public static final ImageIcon FINISH_NODE_IMAGE = new ImageIcon("images/nav/finish.gif");
	
	//����ʧ�ܽڵ�ͼƬ
	public static final ImageIcon FAIL_NODE_IMAGE = new ImageIcon("images/nav/fail.gif");
	
	//������ɵĽڵ�
	public static final ImageIcon DOWNLOADING_NODE_IMAGE = new ImageIcon("images/nav/downloading.gif");
	
	//��������״̬ͼƬ
	public static final ImageIcon DOWNLOADING_IMAGE = new ImageIcon("images/state/downloading.gif");
	
	//����������Դ��ͼƬ
	public static final ImageIcon CONNECTING_IMAGE = new ImageIcon("images/state/connecting.gif");

	//������ɵ�ͼƬ
	public static final ImageIcon FINISHED_IMAGE = new ImageIcon("images/state/finished.gif");
	
	//�������ӵ�ͼƬ
	public static final ImageIcon FAILED_IMAGE = new ImageIcon("images/state/failed.gif");
	
	//��ͣ���ص�ͼƬ
	public static final ImageIcon PAUSE_IMAGE = new ImageIcon("images/state/pause.gif");
	
	public static final String SUSPEND_IMAGE_PATH = "images/flashget.gif";
	//������������˵�
	public static final ImageIcon SUSPEND_OPEN_IAMGE = new ImageIcon("images/suspend/open.gif");
	//����������˵�
	public static final ImageIcon SUSPEND_NEW_IAMGE = new ImageIcon("images/suspend/add.gif");
	//������ʼ����˵�
	public static final ImageIcon SUSPEND_START_IAMGE = new ImageIcon("images/suspend/start.gif");
	//������ͣ����˵�
	public static final ImageIcon SUSPEND_PAUSE_IAMGE = new ImageIcon("images/suspend/pause.gif");
	//ɾ�����������
	public static final ImageIcon SUSPEND_REMOVE_IAMGE = new ImageIcon("images/suspend/remove.gif");
	//�˳��˵�
	public static final ImageIcon SUSPEND_QUIT_IAMGE = new ImageIcon("images/suspend/quit.gif");
	//������ͼƬ
	public static final String TRAY_ICON_PATH = "images/flashget-trayicon.gif";
	
	/**
	 * ��������ͼƬ
	 * @return
	 */
	public static BufferedImage getImage(String path) {
		try {
			return ImageIO.read(new File(path));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
