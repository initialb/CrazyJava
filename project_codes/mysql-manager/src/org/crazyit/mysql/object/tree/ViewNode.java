package org.crazyit.mysql.object.tree;

import javax.swing.Icon;

import org.crazyit.mysql.object.ViewObject;
import org.crazyit.mysql.util.ImageUtil;



/**
 * ��ͼ�ڵ�
 * @author yangenxiong
 *
 */
public class ViewNode implements ViewObject {

	private Database database;
	
	public ViewNode(Database database) {
		this.database = database;
	}

	
	public Icon getIcon() {
		return ImageUtil.VIEW_TREE_ICON;
	}

	
	public String toString() {
		return "��ͼ";
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
	
}
