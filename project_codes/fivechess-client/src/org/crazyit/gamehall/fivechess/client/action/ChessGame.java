package org.crazyit.gamehall.fivechess.client.action;

import org.crazyit.gamehall.commons.Game;
import org.crazyit.gamehall.commons.Request;
import org.crazyit.gamehall.commons.User;
import org.crazyit.gamehall.fivechess.client.ChessClientContext;
import org.crazyit.gamehall.fivechess.commons.ChessUser;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * ʵ�ֿ���е�Game�ӿ�, ��������Ϸ�����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class ChessGame implements Game {

	public String toString() {
		return "������";
	}

	public void start(User user) {
		//�õ�������Ϸ�������Ϣ
		ChessUser cu = convertUser(user);
		ChessClientContext.chessUser = cu;
		//����һ������, ���߷�������ҽ������, ��������Ӧ��������LoginAction
		Request req = new Request("org.crazyit.gamehall.fivechess.server.action.LoginAction", 
				"org.crazyit.gamehall.fivechess.client.action.ClientInAction");
		req.setParameter("user", cu);
		//�õ���ҵ�Socket����������, ���߷�������ҽ����˴���
		cu.getPrintStream().println(XStreamUtil.toXML(req));
	}
	
	//��Userת����ChessUser����
	private ChessUser convertUser(User user) {
		ChessUser cu = new ChessUser();
		cu.setHeadImage(user.getHeadImage());
		cu.setId(user.getId());
		cu.setName(user.getName());
		cu.setSex(user.getSex());
		cu.setSocket(user.getSocket());
		return cu;
	}

}
