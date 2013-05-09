package org.crazyit.gamehall.fivechess.server.action;

import java.net.Socket;

import org.crazyit.gamehall.commons.Request;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.commons.ServerAction;
import org.crazyit.gamehall.fivechess.commons.ChessUser;
import org.crazyit.gamehall.fivechess.commons.Table;
import org.crazyit.gamehall.fivechess.server.ChessContext;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * ����Ϸ�з���������Ϣ, ������������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class GameMessageAction implements ServerAction {

	public void execute(Request request, Response response, Socket socket) {
		String senderId = (String)request.getParameter("senderId");
		ChessUser sender = ChessContext.users.get(senderId);
		String content = (String)request.getParameter("content");
		//�õ����������ڵ�����
		Table table = ChessContext.getTable(senderId);
		if (table != null ) {
			//����ַ���
			ChessUser receiver = table.getAnotherUser(sender);
			if (receiver != null) {
				response.setData("content", sender.getName() + " ����˵��" + content);
				receiver.getPrintStream().println(XStreamUtil.toXML(response));
			}
		}
	}

}
