package org.crazyit.gamehall.commons;

import java.net.Socket;

/**
 * ��������������Ľӿ�
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public interface ServerAction {

	void execute(Request request, Response response, Socket socket);
}
