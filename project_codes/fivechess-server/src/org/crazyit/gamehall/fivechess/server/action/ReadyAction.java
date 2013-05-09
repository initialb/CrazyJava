package org.crazyit.gamehall.fivechess.server.action;

import java.net.Socket;

import org.crazyit.gamehall.commons.Request;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.commons.ServerAction;
import org.crazyit.gamehall.fivechess.commons.Chess;
import org.crazyit.gamehall.fivechess.commons.ChessUser;
import org.crazyit.gamehall.fivechess.commons.Seat;
import org.crazyit.gamehall.fivechess.commons.Table;
import org.crazyit.gamehall.fivechess.server.ChessContext;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * ���׼����Ϸ
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class ReadyAction implements ServerAction {
	
	public void execute(Request request, Response response, Socket socket) {
		//�õ�׼����Ϸ�����
		String userId = (String)request.getParameter("userId");
		//�õ����ӱ��
		Integer tableNumber = (Integer)request.getParameter("tableNumber");
		//�õ����
		ChessUser user = ChessContext.users.get(userId);
		user.setReady(true);
		//�ж϶Է��Ƿ��Ѿ�׼����Ϸ
		//�õ����Ӷ���
		Table table = Table.getTable(tableNumber, ChessContext.tables);
		Seat seat = table.getUserSeat(user);
		//�õ�����
		ChessUser opponent = table.getAnotherSeat(seat).getUser();
		if (opponent != null) {
			//������λ����, ���ж϶����Ƿ��Ѿ�׼������
			if (opponent.isReady()) {
				//������������
				createChessArray(table);
				//��˫����ҷ�����Ӧ, ��Ϸ��ʼ
				opponent.getPrintStream().println(XStreamUtil.toXML(response));
				user.getPrintStream().println(XStreamUtil.toXML(response));
			}
			//���߶���, �Լ�׼������, ʹ�ý���׼���Ŀͻ��˴����࣬�ô������ɶ���ִ��
			String opponentAction = (String)request.getParameter("opponentAction");
			response.setActionClass(opponentAction);
			response.setData("userId", userId);
			opponent.getPrintStream().println(XStreamUtil.toXML(response));
		}
	}
	
	private void createChessArray(Table table) {
		//�����Ѿ�׼������, �ڷ������д���������
		Chess[][] newChess = new Chess[Chess.CHESS_BOARD_X_SIZE][Chess.CHESS_BOARD_Y_SYZE];
		for (int i = 0; i < newChess.length; i++) {
			for (int j = 0; j < newChess[i].length; j++) {
				Chess c = new Chess(i, j, null);
				newChess[i][j] = c;
			}
		}
		//����������������ŵ�����������������
		ChessContext.tableChesses.put(table.getTableNumber(), newChess);
	}

}
