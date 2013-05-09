package org.crazyit.gamehall.fivechess.client.action.game;

import org.crazyit.gamehall.commons.ClientAction;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.fivechess.client.ui.UIContext;
import org.crazyit.gamehall.fivechess.client.ui.game.GamePanel;

/**
 * ����������, ���շ��������͵���Ӧ
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class TakeChessAction implements ClientAction {

	public void execute(Response response) {
		//�õ�����
		Integer i = (Integer)response.getData("i");
		Integer j = (Integer)response.getData("j");
		String color = (String)response.getData("color");
		GamePanel gamePanel = (GamePanel)UIContext.modules.get(UIContext.GAME_PANEL);
		gamePanel.getChessArray()[i][j].setColor(color);
		gamePanel.myTurn();
	}

}
