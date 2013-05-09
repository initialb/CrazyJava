package org.crazyit.ioc.xml.construct;

/**
 * value�ڵ�
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class ValueElement implements DataElement {

	private Object value;
		
	/**
	 * ����valueΪ��value�ڵ��ֵ, clazzΪvalue�ڵ������type
	 * @param value
	 * @param clazz
	 */
	public ValueElement(Object value) {
		this.value = value;
	}
	
	public String getType() {
		return "value";
	}

	public Object getValue() {
		return this.value;
	}
	

}
