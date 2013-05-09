package org.crazyit.gamehall.fivechess.client.action.game;

import org.crazyit.gamehall.commons.ClientAction;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.fivechess.client.ui.HallPanel;
import org.crazyit.gamehall.fivechess.client.ui.UIContext;
import org.crazyit.gamehall.fivechess.client.ui.game.ChessFrame;
import org.crazyit.gamehall.fivechess.commons.ChessUser;

/**
 * �����˳���Ϸ, ����������ʣ�µ����, �����˳���
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class OpponentExitAction implements ClientAction {

	public void execute(Response response) {
		//�õ��˳������Id
		String exitUserId = (String)response.getData("userId");
		//�õ���������
		HallPanel hallPanel = (HallPanel)UIContext.modules.get(UIContext.HALL_PANEL);
		//�õ��˳������
		ChessUser exitUser = hallPanel.getUser(exitUserId);
		//����û���˳������, ����ˢ�½���
		ChessFrame cf = (ChessFrame)UIContext.modules.get(UIContext.GAME_FRAME);
		cf.userExit(exitUser);
	}

}
