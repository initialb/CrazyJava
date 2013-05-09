package org.crazyit.gamehall.fivechess.client.ui.game;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import org.crazyit.gamehall.commons.Request;
import org.crazyit.gamehall.fivechess.client.ui.UIContext;
import org.crazyit.gamehall.fivechess.client.util.ImageUtil;
import org.crazyit.gamehall.fivechess.commons.Chess;
import org.crazyit.gamehall.fivechess.commons.ChessUser;
import org.crazyit.gamehall.fivechess.commons.Seat;
import org.crazyit.gamehall.fivechess.commons.Table;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * ��������Ϸ����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class GamePanel extends JPanel {

	
	//�����еĶ�ά����
	private Chess[][] chessArray;
	
	private Table table;
	
	private ChessUser user;
	
	//����ͼƬ
	private static Image chessboard = ImageUtil.getImage("images/fivechess/fiveStoneBoard.jpg");
	
	//����ͼƬ
	private static Image background = ImageUtil.getImage("images/fivechess/background.gif");
	
	//׼��
	private static Image ready = ImageUtil.getImage("images/fivechess/ready.gif");
	
	//��ʼ
	private static Image tool_begin = ImageUtil.getImage("images/fivechess/tool-begin.gif");
	
	//���������
	private static Image tool_drawAndLost = ImageUtil.getImage("images/fivechess/tool-draw-lost.gif");
	
	//׼����Ϸ������
	private static Image tool_ready = ImageUtil.getImage("images/fivechess/tool-ready.gif");
	
	//��ǰ�Ĺ���ͼƬ
	private Image currentToolImage;
	
	//���ε����ָ��
	private final static Cursor HAND_CURSOR = new Cursor(Cursor.HAND_CURSOR);
	
	//Ĭ�ϵ����ָ��
	private final static Cursor DEFAULT_CURSOR = Cursor.getDefaultCursor();
	
	//��ʼ�˵�������
	private Rectangle startRange = new Rectangle(318, 630, 73, 40);
	
	//��Ͳ˵�������
	private Rectangle drawRange = new Rectangle(185, 630, 73, 40);
	
	//����˵�������
	private Rectangle lostRange = new Rectangle(460, 630, 73, 40);
	
	//������ͼƬ������
	private Rectangle toolRange = new Rectangle(160, 630, 400, 40);
	
	//������ߵ����
	private Image leftUserHead;
	
	//�����ұߵ����
	private Image rightUserHead;
	
	//�Ƿ����ڽ�����Ϸ
	private boolean gaming;
	
	private static Image BLACK_DISK = ImageUtil.getImage("images/fivechess/blackDisk.gif");
	
	private static Image WHITE_DISK = ImageUtil.getImage("images/fivechess/whiteDisk.gif");
	
	//����ͼƬ
	public final static Image BLACK_CHESS = ImageUtil.getImage("images/fivechess/black.gif");
	
	//����ͼƬ
	public final static Image WHITE_CHESS = ImageUtil.getImage("images/fivechess/white.gif");
	
	//��ʼ��Ϸ��ʱ����ʾͼƬ
	private Image gameStartImage;
	
	//��ʼ��Ϸʱ��ʾ��ʼͼƬ�Ķ�ʱ��
	private StartGameTask startGameTask;
	
	private Timer timer;
	
	//���̱�ԵX����
	public final static int CHESS_BOARD_X = 85 + 23;
	
	//���̱�ԵY����
	public final static int CHESS_BOARD_Y = 80 + 23;
	
	public Rectangle chessBoardRange = new Rectangle(85, 80, 535, 536);
	
	//���̵�Ԫ��Ŀ�
	public final static int CHESS_BOARD_CELL_WIDTH = 35;
	//���̵�Ԫ��ĸ�
	public final static int CHESS_BOARD_CELL_HEIGHT = 35;
	
	//�Ƿ��ֵ���ǰ�������
	private boolean myTurn = false;
	
	//����ǰ�ĺ�ɫ��ѡ��ͼƬ
	private final static Image BLACK_SELECT_PLAY_IMAGE = ImageUtil.getImage("images/fivechess/black-play-select.png");
	
	//����ǰ�İ�ɫ��ѡ��ͼƬ
	private final static Image WHITE_SELECT_PLAY_IMAGE = ImageUtil.getImage("images/fivechess/white-play-select.png");
	
	//��ǰ����ǰ��ѡ��ͼƬ
	private Image selectImage;
	
	//ѡ��ͼƬ��X����
	private int selectImageX = 0;
	
	//ѡ��ͼƬ��Y����
	private int selectImageY = 0;
	
	public GamePanel(Table table, ChessUser user) {
		this.table = table;
		this.user = user;
		this.setMaximumSize(new Dimension(710, 700));
		this.setMinimumSize(new Dimension(710, 700));
		this.currentToolImage = tool_begin;
	    this.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				mouseMove(e);
			}
	    });
	    this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				mouseClick(e);
			}
	    });
	}
	
	//����ƶ�
	private void mouseMove(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		//�ж��Ƿ���Ϸ״̬
		if (this.gaming) {
			setCursor(this.drawRange.contains(x, y) || this.lostRange.contains(x, y));
			//�ж��Ƿ��ֵ��Լ�����
			if (this.myTurn) {
				//�ж����ָ���Ƿ���������
				if (this.chessBoardRange.contains(x, y)) {
					this.selectImageX = x - Chess.IMAGE_WIDTH / 2;
					this.selectImageY = y - Chess.IMAGE_HEIGHT / 2;
					this.repaint();
				}
			}
		} else {
			//��Ϸû�п�ʼ, �ж�����Ƿ��Ѿ�׼��
			if (!this.user.isReady()) setCursor(this.startRange.contains(x, y));
			else setCursor(false);
		}

	}
	
	//��õ�ǰx, y�����Ӧ��Chess����
	private Chess getSelectChess(int x, int y) {
		for (int i = 0; i < this.chessArray.length; i++) {
			for (int j = 0; j < this.chessArray[i].length; j++) {
				Chess c = this.chessArray[i][j];
				if (c.getRange().contains(x, y)) {
					return c;
				}
			}
		}
		return null;
	}
	
	//����״̬�������ָ��
	private void setCursor(boolean state) {
		if (state) setCursor(HAND_CURSOR);
		else setCursor(DEFAULT_CURSOR);
	}
	
	private void mouseClick(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (this.toolRange.contains(x, y)) {
			if (this.gaming) {
				//��Ϸ�Ѿ���ʼ
				//�ж��Ƿ��������
				if (this.drawRange.contains(x, y)) requestDraw();
				//�ж��Ƿ���������
				if (this.lostRange.contains(x, y)) requestLost();
			} else {
				//��Ϸû�п�ʼ
				//�жϵ��λ��
				if (this.startRange.contains(x, y)) ready();
			}
		}
		if (this.gaming) {
			//�ж��Ƿ��ֵ��Լ�����
			if (this.myTurn) {
				//�ж��Ƿ������������
				if (this.chessBoardRange.contains(x, y)) takeChess(x, y);
			}
		}
	}
	
	//����ķ���
	private void takeChess(int x, int y) {
		Chess chess = getSelectChess(x, y);
		if (chess != null) {
			//��ǰλ��������
			if (chess.getColor() != null) {
				UIContext.showMessage("��λ���Ѿ�������");
			} else {
				chess.setColor(getChessColor());
				this.myTurn = false;
				this.selectImage = null;
				requestTakeChess(chess);
				this.repaint();
			}
		}
	}
	
	//���߷������Լ�������
	private void requestTakeChess(Chess chess) {
		Request request = new Request(
			"org.crazyit.gamehall.fivechess.server.action.TakeChessAction", 
			"org.crazyit.gamehall.fivechess.client.action.game.TakeChessAction");
		request.setParameter("i", chess.getI());
		request.setParameter("j", chess.getJ());
		request.setParameter("userId", this.user.getId());
		request.setParameter("tableNumber", this.table.getTableNumber());
		request.setParameter("color", chess.getColor());
		//���ô���ʤ����Action
		request.setParameter("winAction", 
				"org.crazyit.gamehall.fivechess.client.action.game.WinAction");
		//���ô������Action
		request.setParameter("lostAction", 
				"org.crazyit.gamehall.fivechess.client.action.game.LostAction");
		this.user.getPrintStream().println(XStreamUtil.toXML(request));
	}
	
	//ʤ�����õķ���
	public void win() {
		endGame();
		UIContext.showMessage("��Ӯ��");
	}
	
	//ʧ�ܵ��õķ���
	public void lost() {
		endGame();
		UIContext.showMessage("������");
	}
	
	//������Ϸ
	private void endGame() {
		this.selectImage = null;
		this.gaming = false;
		this.myTurn = false;
		this.user.setReady(false);
		this.currentToolImage = tool_begin;
		ChessUser opponent = getOtherChessUser();
		if (opponent != null) {
			opponent.setReady(false);
		}
		this.repaint();
	}
 	
	//���׼����Ϸ
	private void ready() {
		if (this.user.isReady()) return;
		this.user.setReady(true);
		this.currentToolImage = tool_ready;
		this.repaint();
		//������Ϣ��������, ���߷������Ѿ�׼������
		Request request = new Request("org.crazyit.gamehall.fivechess.server.action.ReadyAction", 
				"org.crazyit.gamehall.fivechess.client.action.game.StartGameAction");
		request.setParameter("userId", this.user.getId());
		request.setParameter("tableNumber", this.table.getTableNumber());
		//�������û��׼��, �����ö��ֵĴ�����
		request.setParameter("opponentAction", 
				"org.crazyit.gamehall.fivechess.client.action.game.OpponentReadyAction");
		this.user.getPrintStream().println(XStreamUtil.toXML(request));
	}
	
	//��ʾ��ʼͼƬ
	public void showStartImage() {
		if (this.startImageY >= 330) {
			this.timer.cancel();
			this.timer = null;
			this.gameStartImage = null;
			this.startImageY = 230;
		}
		this.startImageY += 2;
		this.repaint();
	}
	
	//�������
	private void requestDraw() {
		int result = UIContext.showConfirm("��ȷ��Ҫ�����?");
		if (result == 0) {
			Request request = new Request(
					"org.crazyit.gamehall.fivechess.server.action.DrawAction", 
			"org.crazyit.gamehall.fivechess.client.action.game.DrawAction");
			request.setParameter("userId", this.user.getId());
			request.setParameter("tableNumber", this.table.getTableNumber());
			this.user.getPrintStream().println(XStreamUtil.toXML(request));
		} else {
			return;
		}
	}
	
	//�������������
	public void sendLostRequest() {
		Request request = new Request(
		"org.crazyit.gamehall.fivechess.server.action.LostAction", 
		"org.crazyit.gamehall.fivechess.client.action.game.OpponentLostAction");
		request.setParameter("userId", this.user.getId());
		request.setParameter("tableNumber", this.table.getTableNumber());
		this.user.getPrintStream().println(XStreamUtil.toXML(request));
	}
	
	//���յ����������Ϣ�Ĵ�����
	public void opponentRequestDraw(String userName) {
		int result = UIContext.showConfirm(userName + " �������, �Ƿ�ͬ��?");
		if (result == 0) agreeDraw();
		if (result == 1) refuseDraw();
	}
	
	//���־ܾ����
	public void handleRefuseDraw(String userName) {
		UIContext.showMessage("�Է��ܾ�����������");
	}
	
	//�ܾ����
	private void refuseDraw() {
		//���߷������ܾ�����
		Request request = new Request("org.crazyit.gamehall.fivechess.server.action.RefuseDrawAction", 
				"org.crazyit.gamehall.fivechess.client.action.game.RefuseDrawAction");
		request.setParameter("userId", this.user.getId());
		request.setParameter("tableNumber", this.table.getTableNumber());
		this.user.getPrintStream().println(XStreamUtil.toXML(request));
	}
	
	//ͬ�����
	private void agreeDraw() {
		draw();
		//���߷�����ͬ�����
		Request request = new Request("org.crazyit.gamehall.fivechess.server.action.AgreeDrawAction", 
				"org.crazyit.gamehall.fivechess.client.action.game.AgreeDrawAction");
		request.setParameter("userId", this.user.getId());
		request.setParameter("tableNumber", this.table.getTableNumber());
		this.user.getPrintStream().println(XStreamUtil.toXML(request));
	}
	
	//˫��ͬ������Ĵ���
	public void draw() {
		UIContext.showMessage("����");
		endGame();
	}
	
	//��������
	private void requestLost() {
		int result = UIContext.showConfirm("ȷ���Ƿ�Ҫ����");
		if (result == 0) {
			lost();
			sendLostRequest();
		}
	}
	
	//�Է�������
	public void opponentLost() {
		win();
	}
	
	public Table getTable() {
		return this.table;
	}
	
	//��ʼ��Ϸ��ͼƬY����
	private int startImageY = 250;
	
	//������Ϸ״̬
	public void startGame() {
		this.gaming = true;
		this.currentToolImage = tool_drawAndLost;
		//���ÿ�ʼ��Ϸ��״̬
		if (getUserSide().equals(Seat.LEFT)) {//�Լ�������
			this.myTurn = true;
			this.gameStartImage = ImageUtil.getImage("images/fivechess/start-game-you-first.gif");
		} else {//����������
			this.gameStartImage = ImageUtil.getImage("images/fivechess/start-game-opponent-first.gif");
		}
		this.selectImage = getSelectImage();
		this.startGameTask = new StartGameTask(this);
		this.timer = new Timer();
		timer.schedule(this.startGameTask, 0, 20);
	}
	
	//�ֵ��Լ�����
	public void myTurn() {
		this.selectImage = getSelectImage();
		this.myTurn = true;
		this.repaint();
	}
	
	//����ѡ�����ӵ�ͼƬ
	private Image getSelectImage() {
		String side = getUserSide();
		if (side.equals(Seat.LEFT)) return BLACK_SELECT_PLAY_IMAGE;
		else return WHITE_SELECT_PLAY_IMAGE;
	}
	
	//��õ�ǰ��ҵ�������ɫ
	private String getChessColor() {
		String side = getUserSide();
		if (side.equals(Seat.LEFT)) return Chess.BLACK;
		else return Chess.WHITE;
	}
	
	//��õ�ǰ��ҵ�����λ��
	private String getUserSide() {
		Seat seat = this.table.getUserSeat(this.user);
		return seat.getSide();
	}
	
	/**
	 * ���ض���
	 * @return
	 */
	public ChessUser getOtherChessUser() {
		Seat seat = this.table.getUserSeat(this.user);
		Seat otherSeat = this.table.getAnotherSeat(seat);
		return otherSeat.getUser();
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), this);
		g.drawImage(chessboard, 85, 80, this);
		ChessUser lu = this.table.getLeftSeat().getUser();
		ChessUser ru = this.table.getRightSeat().getUser();
		//���������ҵ�ͷ��
		this.leftUserHead = getUserHead(this.leftUserHead, lu);
		//�����ұ���ҵ�ͷ��
		this.rightUserHead = getUserHead(this.rightUserHead, ru);
		//��ͷ��
		g.drawImage(this.leftUserHead, 30, 300, this);
		g.drawImage(this.rightUserHead, 645, 300, this);
		//����ߵ����
		drawLeftUser(g, lu);
		//���ұߵ����
		drawRightUser(g, ru);
		//��������
		g.drawImage(this.currentToolImage, 160, 630, this);
		//��Ϸ��ʼ��һ˲�仭��ʼͼƬ
		g.drawImage(this.gameStartImage, 208, this.startImageY, this);
		//�����̵�����
		paintChessBoard(g);
		//�ж��Ƿ��Լ�����
		if (this.myTurn) {
			g.drawImage(this.selectImage, selectImageX, selectImageY, this);
		}
	}
	
	//�����������黭���̵�����
	private void paintChessBoard(Graphics g) {
		if (this.chessArray != null) {
			for (int i = 0; i < this.chessArray.length; i++) {
				for (int j = 0; j < this.chessArray[i].length; j++) {
					Chess chess = this.chessArray[i][j];
					if (chess.getColor() != null) {
						g.drawImage(getChessImage(chess.getColor()), 
								chess.getBeginX(), chess.getBeginY(), null);
					}
				}
			}
		}
	}
	
	//��������ͼƬ
	private Image getChessImage(String color) {
		if (color.equals(Chess.BLACK)) return BLACK_CHESS;
		else return WHITE_CHESS;
	}
	
	//����ߵ����
	private void drawLeftUser(Graphics g, ChessUser lu) {
		if (lu != null) {
			g.drawString(lu.getName(), 30, 360);//������
			if (!this.gaming) {//����Ϸ�вŻ�׼��ͼƬ
				if (lu.isReady()) g.drawImage(ready, 5,360, this);//׼��ͼƬ
			}
			g.drawImage(BLACK_DISK, 25, 230, this);//���ڰ���ͼ��
		}
	}
	
	//���ұߵ����
	private void drawRightUser(Graphics g, ChessUser ru) {
		if (ru != null) {
			g.drawString(ru.getName(), 645, 360);//������
			if (!this.gaming) {//����Ϸ�вŻ�׼��ͼƬ
				if (ru.isReady()) g.drawImage(ready, 630,360, this);//׼��ͼƬ	
			}
			g.drawImage(WHITE_DISK, 640, 230, this);
		}
	}
	
	//�����ҵ�ͷ��ͼƬ, ����User�����б����ֻ��һ��ͼƬURL
	private Image getUserHead(Image userHead, ChessUser user) {
		//�ж���λ�Ƿ������
		if (user != null) {
			//�ж��Ƿ��Ѿ���ʼ��ͷ��ͼƬ, ��֤�����ζ�ȡ
			if (userHead == null) {
				userHead = ImageUtil.getImage(user.getHeadImage());
			}
		} else {
			//��λû�����, ������ͼƬΪ��
			userHead = null;
		}
		return userHead;
	}
	
	public void setChessArray(Chess[][] chessArray) {
		this.chessArray = chessArray;
	}
	
	public Chess[][] getChessArray() {
		return this.chessArray;
	}
	
	public boolean isGaming() {
		return this.gaming;
	}
}

class StartGameTask extends TimerTask {

	private GamePanel gamePanel;
	
	public StartGameTask(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
	public void run() {
		this.gamePanel.showStartImage();
	}
	
}
