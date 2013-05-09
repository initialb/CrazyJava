package org.crazyit.editor;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * �ĵ�������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class EditDocumentListener implements DocumentListener {
	//���������
	private EditorFrame editorFrame;
	public EditDocumentListener(EditorFrame editorFrame) {
		this.editorFrame = editorFrame;
	}
	public void changedUpdate(DocumentEvent e) {
	}
	public void insertUpdate(DocumentEvent e) {
		//���õ�ǰ�༭���ļ���saved����Ϊfalse
		this.editorFrame.getCurrentFile().setSaved(false);
	}
	public void removeUpdate(DocumentEvent e) {
	}
}
