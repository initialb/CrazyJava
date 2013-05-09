package org.crazyit.gamehall.fivechess.server.action;

import java.net.Socket;

import org.crazyit.gamehall.commons.Request;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.commons.ServerAction;
import org.crazyit.gamehall.fivechess.commons.ChessUser;
import org.crazyit.gamehall.fivechess.server.ChessContext;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * �ڶ�����ҽ�����Ϸ, ���һ����ҷ�����Ϣ
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class OpponentEnterAction implements ServerAction {

	public void execute(Request request, Response response, Socket socket) {
		//�õ���һ����ҵĶ���(����������˵Ķ���)
		String firstUserId = (String)request.getParameter("firstUserId");
		ChessUser firstUser = ChessContext.users.get(firstUserId);
		//�õ��ڶ�����ҵĶ���
		String secondUserId = (String)request.getParameter("secondUserId");
		response.setData("opponentId", secondUserId);
		//���ߵ�һ��������Ϸ�����, �ж��ֽ���
		firstUser.getPrintStream().println(XStreamUtil.toXML(response));
	}

}
