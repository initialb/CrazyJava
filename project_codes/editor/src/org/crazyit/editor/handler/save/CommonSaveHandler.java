package org.crazyit.editor.handler.save;

import org.crazyit.editor.EditorFrame;
import org.crazyit.editor.commons.EditFile;
import org.crazyit.editor.util.FileUtil;

/**
 * ִ����ͨ����Ĵ�����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class CommonSaveHandler implements SaveHandler {

	//�ṩһ�����淽������Ϊ��ͨ�ı���
	public String save(EditorFrame editorFrame) {
		EditFile editFile = editorFrame.getCurrentFile();
		FileUtil.writeFile(editFile.getFile(), editFile.getEditPane().getText());
		return null; 
	}

}
