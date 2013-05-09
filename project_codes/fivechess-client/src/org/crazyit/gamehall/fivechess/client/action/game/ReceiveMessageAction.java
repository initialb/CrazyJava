package org.crazyit.gamehall.fivechess.client.action.game;

import org.crazyit.gamehall.commons.ClientAction;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.fivechess.client.ui.ChatPanel;
import org.crazyit.gamehall.fivechess.client.ui.UIContext;

/**
 * ��Ϸ�н���������Ϣ����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class ReceiveMessageAction implements ClientAction {

	public void execute(Response response) {
		//�õ�����Ľ������
		ChatPanel chatPanel = (ChatPanel)UIContext.modules.get(UIContext.GAME_CHAT_PANEL);
		//�ӷ�������Ӧ�еõ�����
		String content = (String)response.getData("content");
		chatPanel.appendContent(content);
	}

}
