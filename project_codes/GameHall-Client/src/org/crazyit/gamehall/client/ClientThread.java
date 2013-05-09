package org.crazyit.gamehall.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.crazyit.gamehall.commons.ClientAction;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.commons.User;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * �ͻ��������߳�, ����ͻ��˽��շ�������Ӧ
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class ClientThread extends Thread {

	private User user;
	
	private String line;
	
	private Map<String, ClientAction> actions = new HashMap<String, ClientAction>();
	
	public ClientThread(User user) {
		this.user = user;
	}
	
	public void run() {
		try {
			InputStream is = this.user.getSocket().getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			while ((this.line = br.readLine()) != null) {
				Response response = getResponse(this.line);
				//�õ��ͻ��˵Ĵ�����
				ClientAction action = getClientAction(response.getActionClass());
				//ִ�пͻ��˴�����
				action.execute(response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//�õ���������Ӧ�еĿͻ��˴�����
	private ClientAction getClientAction(String className) {
		try {
			if (actions.get(className) == null) {
				ClientAction action = (ClientAction)Class.forName(className).newInstance();
				actions.put(className, action);
			}
			return actions.get(className);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//����������Ӧ��xmlת����Response����
	private Response getResponse(String xml) {
		return (Response)XStreamUtil.fromXML(xml);
	}
}
