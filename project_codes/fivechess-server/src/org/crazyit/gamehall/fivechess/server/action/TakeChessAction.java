package org.crazyit.gamehall.fivechess.server.action;

import java.net.Socket;

import org.crazyit.gamehall.commons.Request;
import org.crazyit.gamehall.commons.Response;
import org.crazyit.gamehall.commons.ServerAction;
import org.crazyit.gamehall.fivechess.commons.Chess;
import org.crazyit.gamehall.fivechess.commons.ChessUser;
import org.crazyit.gamehall.fivechess.commons.Table;
import org.crazyit.gamehall.fivechess.server.ChessContext;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * �������ʱ���������������Action
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class TakeChessAction implements ServerAction {

	public void execute(Request request, Response response, Socket socket) {
		//�õ������λ��, ��������һά�Ͷ�ά��ֵ
		Integer i = (Integer)request.getParameter("i");
		Integer j = (Integer)request.getParameter("j");
		//��������
		ChessUser user = ChessContext.users.get((String)request.getParameter("userId"));
		//�õ������ɫ
		String color = (String)request.getParameter("color");
		//�õ����ӱ��
		Integer tableNumber = (Integer)request.getParameter("tableNumber");
		Table table = Table.getTable(tableNumber, ChessContext.tables);
		//������ɫ
		Chess[][] chessArray = ChessContext.tableChesses.get(tableNumber);
		chessArray[i][j].setColor(color);
		//���߶����Ѿ�������
		ChessUser opponent = table.getAnotherUser(user);
		printToOpponent(opponent, response);
		//�ж��Ƿ�ʤ��
		boolean win = validateWin(chessArray, chessArray[i][j]);
		if (opponent == null) win = true;
		//����˫��, Ӯ��
		if (win) {
			//����Ӯ��һ��
			tellWin(request, user, response);
			//�������һ��
			tellLost(request, opponent, response);
			//���÷�������˫����״̬
			opponent.setReady(false);
			user.setReady(false);
		}
	}
	
	//�����������Ϣ
	private void printToOpponent(ChessUser opponent, Response response) {
		if (opponent != null) opponent.getPrintStream().println(XStreamUtil.toXML(response));
	}
	
	//����Ӯ��һ��
	private void tellWin(Request request, ChessUser user, Response response) {
		String winAction = (String)request.getParameter("winAction");
		response.setActionClass(winAction);
		user.getPrintStream().println(XStreamUtil.toXML(response));
	}
	
	//�������һ��
	private void tellLost(Request request, ChessUser opponent, Response response) {
		String lostAction = (String)request.getParameter("lostAction");
		response.setActionClass(lostAction);
		printToOpponent(opponent, response);
	}

	//�ж��Ƿ�ʤ��
	private boolean validateWin(Chess[][] chessArray, Chess chess) {
		boolean win = false;
		if (vertical(chessArray, chess)) win = true;
		if (horizontal(chessArray, chess)) win = true;
		if (bevelUpToDown(chessArray, chess)) win = true;
		if (bevelDownToUp(chessArray, chess)) win = true;
		return win;
	}
	
	//�������
	private boolean vertical(Chess[][] chessArray, Chess chess) {
		//�������ӵ�����
		int count = 0;
		for (int i = 0; i < chessArray.length; i++) {
			if (i == chess.getI()) {
				for (int j = 0; j < chessArray[i].length; j++) {
					Chess c = chessArray[i][j];
					if (c.getColor() != null && c.getColor().equals(chess.getColor())) {
						count++;
					}
				}
			}
		}
		if (count >= ChessContext.LINK_COUNT) return true;
		return false;
	}
	
	//�������
	private boolean horizontal(Chess[][] chessArray, Chess chess) {
		int count = 0;
		for (int j = 0; j < chessArray[0].length; j++) {
			if (j == chess.getJ()) {
				for (int i = 0; i < chessArray.length; i++) {
					Chess c = chessArray[i][j];
					if (c.getColor() != null && c.getColor().equals(chess.getColor())) {
						count++;
					}
				}
			}
		}
		if (count >= ChessContext.LINK_COUNT) return true;
		return false;
	}
	
	//������б�����(������)
	private boolean bevelUpToDown(Chess[][] chessArray, Chess chess) {
		int count = 0;
		//�õ�б�ߵĿ�ʼ
		int min = getMin(chess.getI(), chess.getJ());
		int beginI = chess.getI() - min;
		int beginJ = chess.getJ() - min;
		for (int i = beginI; i < chessArray.length; i++) {
			if (beginJ >= chessArray[0].length) break;
			Chess c = chessArray[i][beginJ];
			if (c.getColor() != null && c.getColor().equals(chess.getColor())) {
				count++;
			}
			beginJ++;
		}
		if (count >= ChessContext.LINK_COUNT) return true;
		return false;
	}
	
	//��i��j�еõ���С��һ��
	private int getMin(int i, int j) {
		if (i > j) return j;
		if (i < j) return i;
		return i;
	}
	
	//������б�����(������)
	private boolean bevelDownToUp(Chess[][] chessArray, Chess chess) {
		int count = 0;
		//�õ���y��ľ���
		int xInstance = chess.getI();
		//�õ���������ά���ֵ�Ĳ�
		int yInstance = chessArray[0].length - 1 - chess.getJ();
		//��������Сֵ
		int min = getMin(xInstance, yInstance);
		//�õ���������ӵ�һά���άֵ
		int beginI = chess.getI() - min;
		int beginJ = chess.getJ() + min;
		for (int i = beginI; i < chessArray.length; i++) {
			if (beginJ < 0) break;
			Chess c = chessArray[i][beginJ];
			if (c.getColor() != null && c.getColor().equals(chess.getColor())) {
				count++;
			}
			beginJ--;
		}
		if (count >= ChessContext.LINK_COUNT) return true;
		return false;
	}
	
}
