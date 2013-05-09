package org.crazyit.gamehall.fivechess.client.ui;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.crazyit.gamehall.commons.Request;
import org.crazyit.gamehall.fivechess.client.object.GameHallInfo;
import org.crazyit.gamehall.fivechess.client.util.ImageUtil;
import org.crazyit.gamehall.fivechess.commons.ChessUser;
import org.crazyit.gamehall.fivechess.commons.Seat;
import org.crazyit.gamehall.fivechess.commons.Table;
import org.crazyit.gamehall.fivechess.commons.util.FiveChessErrorCode;
import org.crazyit.gamehall.util.XStreamUtil;

/**
 * ������JPanel
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class HallPanel extends JPanel {

	private Table[][] tables;
	
	private static Image tableImage = ImageUtil.getImage("images/fivechess/table.jpg");
	
	private static Image seatSelectImage = ImageUtil.getImage("images/fivechess/selected.gif");
	
	//������������, ÿ��������
	public final static int TABLE_COLUMN_SIZE = 5;
	
	//������������
	public final static int TABLE_ROW_SIZE = 10;
	
	//���ε����ָ��
	private final static Cursor HAND_CURSOR = new Cursor(Cursor.HAND_CURSOR);
	
	//Ĭ�ϵ����ָ��
	private final static Cursor DEFAULT_CURSOR = Cursor.getDefaultCursor();
	
	private static Map<String, Image> heads = new HashMap<String, Image>();
	
	//��ǰ��������
	private ChessUser user;
	
	//�������
	private List<ChessUser> users;
	
	//��ʼ����Ϸ����ʱ��Ҫ����������Ϣ
	public HallPanel(GameHallInfo gameHallInfo, ChessUser user, List<ChessUser> users) {
		this.tables = gameHallInfo.getTables();
		this.user = user;
		this.users = users;
	    this.setPreferredSize(new Dimension(gameHallInfo.getTableColumnSize() * Table.DEFAULT_IMAGE_WIDTH, 
	    		gameHallInfo.getTableRowSize() * Table.DEFAULT_IMAGE_HEIGHT));
	    this.revalidate();
	    this.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				moveMouse(e);
			}
	    });
	    this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				sitDown(e);
			}
	    });
	}
	
	//���µ����ӵķ���
	private void sitDown(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		//�������
		Table table = getTable(x, y);
		if (table != null) {
			//�õ���λ
			Seat seat = getSeat(table, x, y);
			if (seat != null) {
				//�ж�����Ƿ��Ѿ�����
				if (this.user.hasSitDown(this.tables)) {
					UIContext.showMessage(FiveChessErrorCode.getMessage(FiveChessErrorCode.HAS_SIT_DOWN));
					return;
				}
				if (seat.getUser() != null) {
					//��λ������
					UIContext.showMessage(FiveChessErrorCode.getMessage(FiveChessErrorCode.SEAT_HAS_USER));
				} else {
					seat.setUser(this.user);
					//û�����������������
					sendServerSitDown(table, seat.getSide());
				}
			}
		}
	}
		
	//�õ���ǰx, y�������λ
	private Seat getSeat(Table table, int x, int y) {
		if (table.getLeftSeat().getRange().contains(x, y)) {
			return table.getLeftSeat();
		} else if (table.getRightSeat().getRange().contains(x, y)) {
			return table.getRightSeat();
		}
		return null;
	}
	
	//���������������, ���߷������Լ��Ѿ�����
	private void sendServerSitDown(Table table, String side) {
		//����Request����������صĲ���
		Request request = new Request("org.crazyit.gamehall.fivechess.server.action.UserSitDownAction", 
				"org.crazyit.gamehall.fivechess.client.action.ReceiveUserSitDownAction");
		request.setParameter("tableNumber", table.getTableNumber());
		request.setParameter("side", side);
		request.setParameter("userId", this.user.getId());
		//����������Ϸ����
		request.setParameter("beginClass", 
				"org.crazyit.gamehall.fivechess.client.action.game.EnterGameAction");
		this.user.getPrintStream().println(XStreamUtil.toXML(request));
		this.repaint();
	}
	
	//�ƶ����ʱ�ķ���
	private void moveMouse(MouseEvent e) {
		Graphics g = this.getGraphics();
		int x = e.getX();
		int y = e.getY();
		//�õ�ѡ�е�����
		Table table = getTable(x, y);
		if (table != null) {
			if (table.getLeftSeat().getRange().contains(x, y)) {
				//�����λ
				this.setCursor(HAND_CURSOR);
				//���λ����û���˲Ÿ���ͼƬ
				if (table.getLeftSeat().getUser() == null) {
					g.drawImage(seatSelectImage, table.getLeftSeatBeginX(), 
							table.getLeftSeatBeginY(), this);
				}
			} else if (table.getRightSeat().getRange().contains(x, y)) {
				//�ұ���λ
				this.setCursor(HAND_CURSOR);
				//���λ����û���˲Ÿ���ͼƬ
				if (table.getRightSeat().getUser() == null) {
					g.drawImage(seatSelectImage, table.getRightSeatBeginX(),
							table.getRightSeatBeginY(), this);
				}
			} else {
				this.setCursor(DEFAULT_CURSOR);
				this.repaint();
			}
		}
	}
	
	//ȡ�õ�ǰ��꾭��ʱ��Table����
	private Table getTable(int x, int y) {
		for (int i = 0; i < this.tables.length; i++) {
			for (int j = 0; j < this.tables[i].length; j++) {
				Table t = this.tables[i][j];
				if (t.getRange().contains(x, y)) return t;
			}
		}
		return null;
	}
	
	//��ȡһ��ͷ��ͼƬ, �����õ�Map��
	private Image getHeadImage(String url) {
		if (heads.get(url) == null) {
			Image head = ImageUtil.getImage(url);
			heads.put(url, head);
		}
		return heads.get(url);
	}
	
	//�����������˵�ʱ��, �͵�����ʾ
	public void seatHasUser() {
		JOptionPane.showConfirmDialog(this, "����λ�Ѿ������", "����", 
				JOptionPane.OK_CANCEL_OPTION);
	}
	
	/**
	 * ���ش����е���������
	 * @return
	 */
	public Table[][] getTables() {
		return this.tables;
	}
	
	//���������, tableNumberΪ���ӱ��, sideΪ����λ��
	public void newUserSitDown(int tableNumber, String side, String userId) {
		//�õ����Ӷ���
		Table table = getTable(tableNumber);
		//�õ���λ
		Seat seat = table.getSeat(side);
		//�õ����µ����
		ChessUser newUser = getUser(userId);
		seat.setUser(newUser);
		this.repaint();
	}
	
	//������ҵ�id�ӵ�ǰ�������е�����еõ���Ҷ���
	public ChessUser getUser(String userId) {
		for (ChessUser u : this.users) {
			if (u.getId().equals(userId)) return u;
		}
		return null;
	}
	
	
	public void paint(Graphics g) {
		for (int i = 0; i < this.tables.length; i++) {
			for (int j = 0; j < this.tables[i].length; j++) {
				Table table = this.tables[i][j];
				Seat leftSeat = table.getLeftSeat();
				Seat rightSeat = table.getRightSeat();
				//�����ӵ�ͼƬ
				g.drawImage(tableImage, table.getBeginX(), 
						table.getBeginY(), this);
				//�������λ�����
				if (leftSeat.getUser() != null) {
					Image head = getHeadImage(leftSeat.getUser().getHeadImage());
					g.drawImage(head, table.getLeftSeatBeginX(),
							table.getLeftSeatBeginY(), this);
				}
				//���ұ���λ�����
				if (rightSeat.getUser() != null) {
					Image head = getHeadImage(rightSeat.getUser().getHeadImage());
					g.drawImage(head, table.getRightSeatBeginX(),
							table.getRightSeatBeginY(), this);
				}
			}
		}
	}

	//�������ӱ��ȡ�����Ӷ���
	public Table getTable(Integer tableNumber) {
		for (int i = 0; i < this.tables.length; i++) {
			for (int j = 0; j < this.tables[i].length; j++) {
				Table table = this.tables[i][j];
				if (tableNumber == table.getTableNumber()) return table;
			}
		}
		return null;
	}
}
