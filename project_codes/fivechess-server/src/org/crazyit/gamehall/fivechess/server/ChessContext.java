package org.crazyit.gamehall.fivechess.server;

import java.util.HashMap;
import java.util.Map;

import org.crazyit.gamehall.fivechess.commons.Chess;
import org.crazyit.gamehall.fivechess.commons.ChessUser;
import org.crazyit.gamehall.fivechess.commons.Seat;
import org.crazyit.gamehall.fivechess.commons.Table;

/**
 * ������������, �����ڷ�������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class ChessContext {

	public static Map<String, ChessUser> users = new HashMap<String, ChessUser>();
	
	//������������, ÿ��������
	public final static int TABLE_COLUMN_SIZE = 5;
	
	//������������
	public final static int TABLE_ROW_SIZE = 10;
	
	//����������Ϣ
	public static Table[][] tables = new Table[TABLE_COLUMN_SIZE][TABLE_ROW_SIZE];
	
	//��Ϸ�����������Ϣ, map�е�keyΪ���Ӻ�, value�Ǹ������ϵĶ�ά����
	public static Map<Integer, Chess[][]> tableChesses = new HashMap<Integer, Chess[][]>();

	public final static int LINK_COUNT = 5;
	
	static {
		//��ʼ��������Ϣ
		tables = new Table[TABLE_COLUMN_SIZE][TABLE_ROW_SIZE];
		int tableNumber = 0;
		for (int i = 0; i < tables.length; i++) {
			for (int j = 0; j < tables[i].length; j++) {
				Table table = new Table(Table.DEFAULT_IMAGE_WIDTH*i, 
						Table.DEFAULT_IMAGE_HEIGHT*j, tableNumber);
				tables[i][j] = table;
				tableNumber++;
			}
		}
	}
	
	/**
	 * �õ�������ڵ�����
	 * @param user
	 * @return
	 */
	public static Table getTable(String userId) {
		for (int i = 0; i < tables.length; i++) {
			for (int j = 0; j < tables[i].length; j++) {
				Table table = tables[i][j];
				Seat ls = table.getLeftSeat();
				if (ls.getUser() != null) {
					ChessUser u = ls.getUser();
					if (u.getId().equals(userId)) return table;
				}
				Seat rs = table.getRightSeat();
				if (rs.getUser() != null) {
					ChessUser u = rs.getUser();
					if (u.getId().equals(userId)) return table;
				}
			}
		}
		return null;
	}

}
