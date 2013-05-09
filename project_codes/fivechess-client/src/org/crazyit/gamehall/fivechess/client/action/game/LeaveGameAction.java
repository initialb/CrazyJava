package org.crazyit.gamehall.fivechess.client.action.game;

import org.crazyit.gamehall.commons.ClientAction;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.fivechess.client.ui.HallPanel;
import org.crazyit.gamehall.fivechess.client.ui.UIContext;
import org.crazyit.gamehall.fivechess.commons.Table;

/**
 * ����뿪��Ϸ��Action
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class LeaveGameAction implements ClientAction {

	public void execute(Response response) {
		//�õ�������Ϣ, �ĸ�����뿪���ĸ�����
		Integer tableNumber = (Integer)response.getData("tableNumber");
		String side = (String)response.getData("side");
		//�õ�����������Ϣ�Ľ������
		HallPanel hallPanel = (HallPanel)UIContext.modules.get(UIContext.HALL_PANEL);
		Table table = hallPanel.getTable(tableNumber);
		//������λ����ҵĿ�
		table.getSeat(side).getUser().setReady(false);
		table.getSeat(side).setUser(null);
		//ˢ�½���
		hallPanel.repaint();
	}

}
