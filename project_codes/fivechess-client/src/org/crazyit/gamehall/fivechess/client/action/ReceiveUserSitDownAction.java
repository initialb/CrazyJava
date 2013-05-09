package org.crazyit.gamehall.fivechess.client.action;

import org.crazyit.gamehall.commons.ClientAction;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.fivechess.client.ui.HallPanel;
import org.crazyit.gamehall.fivechess.client.ui.UIContext;
import org.crazyit.gamehall.fivechess.commons.util.FiveChessErrorCode;

/**
 * ����������µ�Action
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class ReceiveUserSitDownAction implements ClientAction {

	
	public void execute(Response response) {
		//�õ��������
		HallPanel hallPanel = (HallPanel)UIContext.modules.get(UIContext.HALL_PANEL);
		if (response.getErrorCode() != null) {
			String errorCode = (String)response.getErrorCode();
			UIContext.showMessage(FiveChessErrorCode.getMessage(errorCode));
		} else {
			//���µ��������, �������������(������������)ִ��
			int tableNumber = (Integer)response.getData("tableNumber");
			String side = (String)response.getData("side");
			String userId = (String)response.getData("userId");
			hallPanel.newUserSitDown(tableNumber, side, userId);
		}
	}

}
