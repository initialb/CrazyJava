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
 * ������͵�Action
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class DrawAction implements ServerAction {

	public void execute(Request request, Response response, Socket socket) {
		//�õ�������
		String userId = (String)request.getParameter("userId");
		//�õ�����
		Integer tableNumber = (Integer)request.getParameter("tableNumber");
		ChessUser user = ChessContext.users.get(userId);
		//�ҵ�����
		Table table = Table.getTable(tableNumber, ChessContext.tables);
		ChessUser opponent = table.getAnotherUser(user);
		if (opponent != null) {
			response.setData("userName", user.getName());
			opponent.getPrintStream().println(XStreamUtil.toXML(response));
		}
	}

}
