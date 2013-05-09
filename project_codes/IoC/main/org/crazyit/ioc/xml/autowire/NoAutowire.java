package org.crazyit.ioc.xml.autowire;

/**
 * ���Զ�װ���ʵ����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class NoAutowire implements Autowire {

	private String value;
	
	public NoAutowire(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return "no";
	}

}
