package org.crazyit.gamehall.fivechess.client.action.game;

import org.crazyit.gamehall.commons.ClientAction;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.fivechess.client.ui.UIContext;
import org.crazyit.gamehall.fivechess.client.ui.game.GamePanel;
import org.crazyit.gamehall.fivechess.commons.Chess;

/**
 * ���������߿ͻ��˿�ʼ��Ϸ, �������ڿͻ��˿���ʼ��Ϸ
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class StartGameAction implements ClientAction {

	
	public void execute(Response response) {
		//��������
		Chess[][] chessArray = new Chess[Chess.CHESS_BOARD_X_SIZE][Chess.CHESS_BOARD_Y_SYZE];
		for (int i = 0; i < chessArray.length; i++) {
			for (int j = 0; j < chessArray[i].length; j++) {
				int beginX = (GamePanel.CHESS_BOARD_X) - (Chess.IMAGE_WIDTH/2) 
					+ GamePanel.CHESS_BOARD_CELL_WIDTH * i;
				int beginY = (GamePanel.CHESS_BOARD_Y) - (Chess.IMAGE_HEIGHT/2) 
					+ GamePanel.CHESS_BOARD_CELL_HEIGHT * j;
				chessArray[i][j] = new Chess(beginX, beginY, i, j, null);
			}
		}
		GamePanel gamePanel = (GamePanel)UIContext.modules.get(UIContext.GAME_PANEL);
		gamePanel.setChessArray(chessArray);
		gamePanel.startGame();
	}

}
