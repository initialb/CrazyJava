package org.crazyit.gamehall.fivechess.client.action;

import org.crazyit.gamehall.commons.ClientAction;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.fivechess.client.ui.ChatPanel;
import org.crazyit.gamehall.fivechess.client.ui.UIContext;
import org.crazyit.gamehall.fivechess.client.ui.UserTable;
import org.crazyit.gamehall.fivechess.commons.ChessUser;

/**
 * ������ҽ�������ҽ��������Action������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class ReceiveInAction implements ClientAction {

	
	public void execute(Response response) {
		//�õ��½�������
		ChessUser newUser = (ChessUser)response.getData("newUser");
		//������б��м���һ�������
		UserTable userTable = (UserTable)UIContext.modules.get(UIContext.HALL_USER_TABLE);
		userTable.addUser(newUser);
		//���������������
		ChatPanel chatPanel = (ChatPanel)UIContext.modules.get(UIContext.HALL_CHAT_PANEL);
		chatPanel.appendContent(newUser.getName() + " ������");
		chatPanel.refreshJComboBox();
	}

}
