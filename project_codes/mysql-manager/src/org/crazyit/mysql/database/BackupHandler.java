package org.crazyit.mysql.database;

import java.io.File;
import java.util.List;

import org.crazyit.mysql.object.GlobalContext;
import org.crazyit.mysql.object.list.TableData;
import org.crazyit.mysql.object.tree.Database;
import org.crazyit.mysql.object.tree.ServerConnection;

/**
 * ���ݴ���ӿڣ����ڵ����ű���ִ�нű�
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public interface BackupHandler {

	/**
	 * ����һ�����ݿ⵽�ļ�targetFile��
	 * @param ctx
	 * @param db
	 * @param targetFile
	 */
	void dumpDatabase(GlobalContext ctx, Database db, File targetFile);
	
	/**
	 * ���������
	 * @param ctx
	 * @param table
	 * @param db
	 * @param targetFile
	 */
	void dumpTable(GlobalContext ctx, List<TableData> table, Database db, 
			File targetFile);
	
	/**
	 * Ϊĳ�����ݿ⵼��һ��SQL�ļ�
	 * @param ctx
	 * @param db
	 * @param sqlFile
	 */
	void executeSQLFile(GlobalContext ctx, Database db, File sqlFile);
	
	/**
	 * Ϊĳ�����������ӵ���һ��SQL�ļ�
	 * @param ctx
	 * @param conn
	 * @param sqlFile
	 */
	void executeSQLFile(GlobalContext ctx, ServerConnection conn, File sqlFile);
}
