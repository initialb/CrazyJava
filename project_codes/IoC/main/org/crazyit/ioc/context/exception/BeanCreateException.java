package org.crazyit.ioc.context.exception;

/**
 * ����Bean�쳣
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class BeanCreateException extends RuntimeException {

	public BeanCreateException(String e) {
		super(e);
	}
}
