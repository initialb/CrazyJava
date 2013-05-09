package org.crazyit.gamehall.fivechess.client.action.game;

import org.crazyit.gamehall.commons.ClientAction;
import org.crazyit.gamehall.commons.Request;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.fivechess.client.ChessClientContext;
import org.crazyit.gamehall.fivechess.client.ui.HallPanel;
import org.crazyit.gamehall.fivechess.client.ui.UIContext;
import org.crazyit.gamehall.fivechess.client.ui.game.ChessFrame;
import org.crazyit.gamehall.fivechess.commons.Seat;
import org.crazyit.gamehall.fivechess.commons.Table;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * ������������Ϸ��Action
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class EnterGameAction implements ClientAction {

	
	public void execute(Response response) {
		HallPanel hallPanel = (HallPanel)UIContext.modules.get(UIContext.HALL_PANEL);
		//�ӷ�������Ӧ�еõ����ӱ��
		Integer tableNumber = (Integer)response.getData("tableNumber");
		String side = (String)response.getData("side");
		//�������ӱ�ŵõ�������Ϣ
		Table table = Table.getTable(tableNumber, hallPanel.getTables());
		//��ʾ����
		ChessFrame cf = new ChessFrame(table, ChessClientContext.chessUser);
		cf.setVisible(true);
		//���߶Է�������Ϸ(����жԷ���ҵĻ�)
		Seat seat = table.getSeat(side);
		//�õ��Է���λ
		Seat otherSeat = table.getAnotherSeat(seat);
		if (otherSeat.getUser() != null) {
			//�ж���, ���������������
			Request request = new Request(
					"org.crazyit.gamehall.fivechess.server.action.OpponentEnterAction", 
					"org.crazyit.gamehall.fivechess.client.action.game.OpponentEnterAction");
			//firstUserId�Ƕ��ֵ�ID(��һ��������Ϸ�����)
			request.setParameter("firstUserId", otherSeat.getUser().getId());
			//secondUserId���Լ���ID(�������Ϸ�����)
			request.setParameter("secondUserId", seat.getUser().getId());
			ChessClientContext.chessUser.getPrintStream().println(XStreamUtil.toXML(request));
		}
	}

}
