package org.crazyit.gamehall.fivechess.client.ui;

import java.awt.Component;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

/**
 * �ͻ��˽���������, ��������UI�������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class UIContext {

	/**
	 * ��Ž������е����
	 */
	public static Map<String, Component> modules = new HashMap<String, Component>();
	
	//��Ϸ������Panel(HallPanel��)
	public final static String HALL_PANEL = "hallPanel";
	
	//��Ϸ����������Ľ���(ChatPanel��)
	public final static String HALL_CHAT_PANEL = "hallChatPanel";
	
	//��Ϸ�����е�����б�(UserTable��)
	public final static String HALL_USER_TABLE = "hallUserTable";
	
	//��Ϸ��������������(GameHallFrame��)
	public final static String HALL_FRAME = "hallFrame";
	
	//��Ϸ�е�����б�(UserTable��), ��HALL_USER_TABLEʹ��ͬһ����, ����UIContext������ʵ��
	public final static String GAME_USER_TABLE = "gameUserTable";
	
	//��Ϸ�е��������(ChatPanel��), ��HALL_CHAT_PANELʹ��ͬһ����, ����UIContext������ʵ��
	public final static String GAME_CHAT_PANEL = "gameChatPanel";
	
	//��Ϸ����(GamePanel��)
	public final static String GAME_PANEL = "gamePanel";
	
	//������Ϸ����(GameFrame��)
	public final static String GAME_FRAME = "gameFrame";
	
	//������ʾ������Ϣ
	public static int showMessage(String message) {
		return JOptionPane.showConfirmDialog(null, message, "��ʾ", 
				JOptionPane.OK_CANCEL_OPTION);
	}
	
	public static int showConfirm(String message) {
		return JOptionPane.showConfirmDialog(null, message, "ѯ��", 
				JOptionPane.YES_NO_OPTION);
	}
}
