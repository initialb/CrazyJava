package org.crazyit.ioc.xml.construct;

/**
 * ���ݽڵ�
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public interface DataElement {

	/**
	 * �������ݵ�����(ref����value)
	 * @return
	 */
	String getType();
	
	/**
	 * �������ݵ�ֵ
	 * @return
	 */
	Object getValue();
}
