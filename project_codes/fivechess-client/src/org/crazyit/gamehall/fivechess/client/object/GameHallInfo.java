package org.crazyit.gamehall.fivechess.client.object;

import org.crazyit.gamehall.fivechess.commons.Table;

/**
 * ��Ϸ������Ϣ����, �ö����ɷ���������Ӧ����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class GameHallInfo {

	//������Ϣ
	private Table[][] tables;
	
	private int tableColumnSize;
	
	private int tableRowSize;
	
	public GameHallInfo() {
		
	}

	public GameHallInfo(Table[][] tables, int tableColumnSize, int tableRowSize) {
		this.tables = tables;
		this.tableColumnSize = tableColumnSize;
		this.tableRowSize = tableRowSize;
	}

	public Table[][] getTables() {
		return tables;
	}

	public void setTables(Table[][] tables) {
		this.tables = tables;
	}

	public int getTableColumnSize() {
		return tableColumnSize;
	}

	public void setTableColumnSize(int tableColumnSize) {
		this.tableColumnSize = tableColumnSize;
	}

	public int getTableRowSize() {
		return tableRowSize;
	}

	public void setTableRowSize(int tableRowSize) {
		this.tableRowSize = tableRowSize;
	}
	
	
}
