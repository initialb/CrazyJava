package org.crazyit.gamehall.server;

import java.io.File;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.crazyit.gamehall.server.exception.ServerException;

/**
 * ����������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class Server {

	ServerSocket serverSocket;
	
	public Server() {
		try {
			//����ServerSocket����, �˿�Ϊ12000
			this.serverSocket = new ServerSocket(12000);
			while(true) {
				//����Socket������
				Socket s = this.serverSocket.accept();
				//�����������߳�
				new ServerThread(s).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServerException("�����������쳣: " + e.getMessage());
		}
	}

}
