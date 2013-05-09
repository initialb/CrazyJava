package org.crazyit.gamehall.client.util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;

import org.crazyit.gamehall.client.exception.ClientException;

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

	//ͷ��ͼƬ���Ŀ¼
	public final static String HEAD_FOLDER = "images/heads";
	
	//����һ��Map, key���ļ���·��
	public static Map<String, ImageIcon> getHeads() {
		try {
			File folder = new File(HEAD_FOLDER);
			File[] files = folder.listFiles();
			Map<String, ImageIcon> heads = new HashMap<String, ImageIcon>();
			for (int i = 0; i < files.length; i++) {
				File file = files[i];
				heads.put(file.getPath(), new ImageIcon(file.getAbsolutePath()));
			}
			return heads;
		} catch (Exception e) {
			throw new ClientException("��ȡͷ���ļ�����");
		}
	}
}
