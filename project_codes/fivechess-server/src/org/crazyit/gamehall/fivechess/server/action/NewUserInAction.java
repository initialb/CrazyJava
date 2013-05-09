package org.crazyit.gamehall.fivechess.server.action;

import java.net.Socket;

import org.crazyit.gamehall.commons.Request;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.commons.ServerAction;
import org.crazyit.gamehall.fivechess.commons.ChessUser;
import org.crazyit.gamehall.fivechess.server.ChessContext;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * ������ҽ���ʱ���͵�����, ��Action��������ҷ�����Ϣ, ������ҽ���
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class NewUserInAction implements ServerAction {
	
	public void execute(Request request, Response response, Socket socket) {
		//�õ��µ�¼�����
		String userId = (String)request.getParameter("userId");
		ChessUser user = ChessContext.users.get(userId);
		//���������Ϣ�ŵ���Ӧ��
		response.setData("newUser", user);
		//��������ҷ�����Ϣ
		for (String id : ChessContext.users.keySet()) {
			ChessUser hasLogin = ChessContext.users.get(id);
			//���ط��͸��Լ�
			if (id.equals(user.getId())) continue;
			hasLogin.getPrintStream().println(XStreamUtil.toXML(response));
		}
	}

}
