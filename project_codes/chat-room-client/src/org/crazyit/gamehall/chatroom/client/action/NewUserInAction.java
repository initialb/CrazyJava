package org.crazyit.gamehall.chatroom.client.action;

import org.crazyit.gamehall.chatroom.client.ClientContext;
import org.crazyit.gamehall.chatroom.client.ui.MainFrame;
import org.crazyit.gamehall.commons.ClientAction;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.commons.User;

/**
 * �������û�����Ĵ�����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class NewUserInAction implements ClientAction {

	public void execute(Response response) {
		User newUser = (User)response.getData("newUser");
		MainFrame mainFrame = ClientContext.mainFrame;
		mainFrame.addUser(newUser);
	}

}
