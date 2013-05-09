package org.crazyit.gamehall.fivechess.server.action;

import java.net.Socket;

import org.crazyit.gamehall.commons.Request;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.commons.ServerAction;
import org.crazyit.gamehall.fivechess.commons.ChessUser;
import org.crazyit.gamehall.fivechess.server.ChessContext;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * ������Ϣ�ķ�����������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class SendMessageAction implements ServerAction {
	
	public void execute(Request request, Response response, Socket socket) {
		String receiverId = (String)request.getParameter("receiverId");
		String senderId = (String)request.getParameter("senderId");
		ChessUser sender = ChessContext.users.get(senderId);
		String content = (String)request.getParameter("content");
		if (receiverId == null) {
			//�������˷�
			for (String id : ChessContext.users.keySet()) {
				if (id.equals(senderId)) continue;
				ChessUser cu = ChessContext.users.get(id);
				response.setData("content", sender.getName() + " �� ������ ˵��" + content);
				cu.getPrintStream().println(XStreamUtil.toXML(response));
			}
		} else {
			//�õ�������
			ChessUser receiver = ChessContext.users.get(receiverId);
			if (receiver.getId().equals(sender.getId())) return; 
			response.setData("content", sender.getName() + " ����˵��" + content);
			receiver.getPrintStream().println(XStreamUtil.toXML(response));
		}
	}

}
