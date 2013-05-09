package org.crazyit.gamehall.fivechess.server.action;

import java.net.Socket;

import org.crazyit.gamehall.commons.Request;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.commons.ServerAction;
import org.crazyit.gamehall.fivechess.commons.ChessUser;
import org.crazyit.gamehall.fivechess.commons.Seat;
import org.crazyit.gamehall.fivechess.commons.Table;
import org.crazyit.gamehall.fivechess.commons.util.FiveChessErrorCode;
import org.crazyit.gamehall.fivechess.server.ChessContext;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * ������µ�Action
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class UserSitDownAction implements ServerAction {
	
	public void execute(Request request, Response response, Socket socket) {
		//�õ����ӱ��
		Integer tableNumber = (Integer)request.getParameter("tableNumber");
		String side = (String)request.getParameter("side");
		Table table = Table.getTable(tableNumber, ChessContext.tables);
		//�õ������µ����
		String userId = (String)request.getParameter("userId");
		ChessUser user = ChessContext.users.get(userId);
		//�������Ѿ�����λ��, �򷵻ش�����Ϣ
		if (user.hasSitDown(ChessContext.tables)) {
			response.setErrorCode(FiveChessErrorCode.HAS_SIT_DOWN);
			user.getPrintStream().println(XStreamUtil.toXML(response));
			return;
		}
		//�õ���λ
		Seat seat = table.getSeat(side);
		//�ж���λ���Ƿ�����
		if (seat.getUser() != null) {
			//��λ������, ���ʹ�����Ϣ
			response.setErrorCode(FiveChessErrorCode.SEAT_HAS_USER);
			user.getPrintStream().println(XStreamUtil.toXML(response));
		} else {
			seat.setUser(user);
			//�������еĿͻ���, �����µ���������������ĸ�λ��������
			response.setData("tableNumber", table.getTableNumber());
			response.setData("side", side);
			response.setData("user", user.getId());
			//��������ҷ�����Ϣ, �����������
			printResponse(user, response);
			//�õ�������Ϸ�Ŀͻ�����
			String beginClass = (String)request.getParameter("beginClass");
			response.setActionClass(beginClass);
			//���߿ͻ���, ��Ҫ������Ϸ����
			user.getPrintStream().println(XStreamUtil.toXML(response));
		}
	}
	
	/**
	 * ��������ҷ�����Ϣ, ������user������
	 * @param user
	 */
	private void printResponse(ChessUser user, Response response) {
		for (String id : ChessContext.users.keySet()) {
			ChessUser u = ChessContext.users.get(id);
			if (u.getId().equals(user.getId())) continue;
			u.getPrintStream().println(XStreamUtil.toXML(response));
		}
	}
	

}
