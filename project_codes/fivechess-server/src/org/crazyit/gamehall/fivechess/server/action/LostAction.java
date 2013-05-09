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
 * �������ִ�еķ�����Action
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class LostAction implements ServerAction {

	public void execute(Request request, Response response, Socket socket) {
		String userId = (String)request.getParameter("userId");
		Integer tableNumber = (Integer)request.getParameter("tableNumber");
		ChessUser user = ChessContext.users.get(userId);
		Table table = Table.getTable(tableNumber, ChessContext.tables);
		ChessUser opponent = table.getAnotherUser(user);
		//����˫����״̬
		user.setReady(false);
		opponent.setReady(false);
		//���߶���Ӯ��
		opponent.getPrintStream().println(XStreamUtil.toXML(response));
	}

}
