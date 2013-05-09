package org.crazyit.foxmail.object;

import java.io.File;

/**
 * �����Ķ���
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class FileObject {

	//Դ�ļ�����
	private String sourceName;
	//��Ӧ���ļ�
	private File file;
	
	public FileObject(String sourceName, File file) {
		this.sourceName = sourceName;
		this.file = file;
	}

	public String getSourceName() {
		return sourceName;
	}
	
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	
	public File getFile() {
		return file;
	}
	
	public void setFile(File file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return this.sourceName;
	}
	
	
}
