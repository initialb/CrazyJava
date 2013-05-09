package org.crazyit.editor.tree;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * ��Ŀ���Ľڵ����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class ProjectTreeNode extends DefaultMutableTreeNode {

	//�ýڵ��Ӧ���ļ�
	private File file;
	
	//�ýڵ��µ��ӽڵ�
	private List<ProjectTreeNode> children;

	//ProjectTreeNode�Ĺ������������ֱ�ʱ�ýڵ��Ӧ���ļ����Ƿ��������ӽڵ�
	public ProjectTreeNode(File file, boolean allowsChildren) {
		super(file.getName(), allowsChildren);
		this.file = file;
		//��ʼ���ýڵ��µ��ӽڵ㼯��
		children = new ArrayList<ProjectTreeNode>();
	}
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public List<ProjectTreeNode> getChildren() {
		//���children, �����»�ȡһ��
		children.removeAll(children);
		for (int i = 0; i < getChildCount(); i++) {
			children.add((ProjectTreeNode)getChildAt(i));
		}
		return this.children;
	}



	
	
}
