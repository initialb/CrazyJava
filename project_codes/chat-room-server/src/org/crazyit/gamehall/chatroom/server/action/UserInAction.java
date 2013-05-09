package org.crazyit.gamehall.chatroom.server.action;

import java.net.Socket;

import org.crazyit.gamehall.chatroom.server.ChatContext;
import org.crazyit.gamehall.commons.Request;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.commons.ServerAction;
import org.crazyit.gamehall.commons.User;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * �û����������ҵķ�����������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class UserInAction implements ServerAction {

	public void execute(Request request, Response response, Socket socket) {
		//�õ��½��������ҵ��û�
		User user = (User)request.getParameter("user");
		//�����û���Socet
		user.setSocket(socket);
		//�ŵ���������
		ChatContext.users.put(user.getId(), user);
		//����ԭ�����û�, ����������, ���������е��û���Ϣ
		response.setData("users", ChatContext.users);
		user.getPrintStream().println(XStreamUtil.toXML(response));
		//����ȫ���û�, �����û�����
		String receiveUserInAction = (String)request.getParameter("userInAction");
		//�ÿͻ��˴��������˽��������ҵ�Action
		response.setActionClass(receiveUserInAction);
		response.setData("newUser", user);
		//�������û�����
		for (String key : ChatContext.users.keySet()) {
			User u = ChatContext.users.get(key);
			if (u.getId() != user.getId()) {
				u.getPrintStream().println(XStreamUtil.toXML(response));
			}
		}
	}

}
