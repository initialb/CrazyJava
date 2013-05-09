package org.crazyit.gamehall.fivechess.server.action;

import java.net.Socket;

import org.crazyit.gamehall.commons.Request;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.commons.ServerAction;
import org.crazyit.gamehall.fivechess.commons.ChessUser;
import org.crazyit.gamehall.fivechess.commons.Seat;
import org.crazyit.gamehall.fivechess.commons.Table;
import org.crazyit.gamehall.fivechess.server.ChessContext;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * ����뿪��Ϸʱ������ִ�е�Action
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class LeaveGameAction implements ServerAction {

	public void execute(Request request, Response response, Socket socket) {
		Integer tableNumber = (Integer)request.getParameter("tableNumber");
		String userId = (String)request.getParameter("userId");
		//�õ��뿪�����
		ChessUser user = ChessContext.users.get(userId);
		user.setReady(false);
		//�õ�����
		Table table = Table.getTable(tableNumber, ChessContext.tables);
		//�õ���ҵ���λ
		Seat seat = table.getUserSeat(user);
		//������λ�����Ϊ��
		seat.setUser(null);
		response.setData("side", seat.getSide());
		//���ͷ�������Ӧ, �����������, ������˳�
		printResponse(response);
		
		//�����˳���ҵĶ���, ���˳���
		Seat otherSeat = table.getAnotherSeat(seat);
		if (otherSeat.getUser() != null) {
			String exitAction = (String)request.getParameter("exitAction");
			response.setActionClass(exitAction);
			otherSeat.getUser().getPrintStream().println(XStreamUtil.toXML(response));
		}
	}
	
	private void printResponse(Response response) {
		for (String id : ChessContext.users.keySet()) {
			ChessUser u = ChessContext.users.get(id);
			u.getPrintStream().println(XStreamUtil.toXML(response));
		}
	}

}
