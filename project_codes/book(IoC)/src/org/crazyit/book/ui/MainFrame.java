package org.crazyit.book.ui;

import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;

import org.crazyit.book.dao.BookDao;
import org.crazyit.book.dao.BookInRecordDao;
import org.crazyit.book.dao.BookSaleRecordDao;
import org.crazyit.book.dao.ConcernDao;
import org.crazyit.book.dao.InRecordDao;
import org.crazyit.book.dao.SaleRecordDao;
import org.crazyit.book.dao.TypeDao;
import org.crazyit.book.dao.impl.BookDaoImpl;
import org.crazyit.book.dao.impl.BookInRecordDaoImpl;
import org.crazyit.book.dao.impl.BookSaleRecordDaoImpl;
import org.crazyit.book.dao.impl.ConcernDaoImpl;
import org.crazyit.book.dao.impl.InRecordDaoImpl;
import org.crazyit.book.dao.impl.SaleRecordDaoImpl;
import org.crazyit.book.dao.impl.TypeDaoImpl;
import org.crazyit.book.service.BookService;
import org.crazyit.book.service.ConcernService;
import org.crazyit.book.service.InRecordService;
import org.crazyit.book.service.SaleRecordService;
import org.crazyit.book.service.TypeService;
import org.crazyit.book.service.impl.BookServiceImpl;
import org.crazyit.book.service.impl.ConcernServiceImpl;
import org.crazyit.book.service.impl.InRecordServiceImpl;
import org.crazyit.book.service.impl.SaleRecordServiceImpl;
import org.crazyit.book.service.impl.TypeServiceImpl;

public class MainFrame extends JFrame{
	
	SalePanel salePanel;
	
	RepertoryPanel repertoryPanel;
	
	BookPanel bookPanel;
	
	ConcernPanel concernPanel;
	
	TypePanel typePanel;
	
	CommonPanel currentPanel;
	
	private Action sale = new AbstractAction("���۹���", new ImageIcon("images/sale.gif")) {
		public void actionPerformed(ActionEvent e) {
			changePanel(salePanel);
		}
	};
	
	private Action repertory = new AbstractAction("������", new ImageIcon("images/repertory.gif")) {
		public void actionPerformed(ActionEvent e) {
			changePanel(repertoryPanel);
		}
	};

	private Action book = new AbstractAction("�鱾����", new ImageIcon("images/book.gif")) {
		public void actionPerformed(ActionEvent e) {
			changePanel(bookPanel);
			bookPanel.initImage();
			bookPanel.repaint();
		}
	};
	
	private Action type = new AbstractAction("�������", new ImageIcon("images/type.gif")) {
		public void actionPerformed(ActionEvent e) {
			changePanel(typePanel);
		}
	};
	
	private Action concern = new AbstractAction("���������", new ImageIcon("images/concern.gif")) {
		public void actionPerformed(ActionEvent e) {
			changePanel(concernPanel);
		}
	};
	
	public MainFrame(SalePanel salePanel) {
		this.salePanel = salePanel;
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("ϵͳ");
		menuBar.add(menu);
		
		menu.add(sale).setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_MASK));
		menu.add(repertory).setAccelerator(KeyStroke.getKeyStroke('R', InputEvent.CTRL_MASK));
		menu.add(book).setAccelerator(KeyStroke.getKeyStroke('B', InputEvent.CTRL_MASK));
		menu.add(type).setAccelerator(KeyStroke.getKeyStroke('T', InputEvent.CTRL_MASK));
		menu.add(concern).setAccelerator(KeyStroke.getKeyStroke('T', InputEvent.CTRL_MASK));

		//�����۽�����Ϊ��һ��ʾ����
		this.add(salePanel);
		this.currentPanel = salePanel;
		//��ʼ�����۽��������
		this.salePanel.initData();
		
		this.setJMenuBar(menuBar);
		this.setTitle("ͼ�����������ϵͳ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	public void setRepertoryPanel(RepertoryPanel repertoryPanel) {
		this.repertoryPanel = repertoryPanel;
	}

	public void setBookPanel(BookPanel bookPanel) {
		this.bookPanel = bookPanel;
	}

	public void setConcernPanel(ConcernPanel concernPanel) {
		this.concernPanel = concernPanel;
	}

	public void setTypePanel(TypePanel typePanel) {
		this.typePanel = typePanel;
	}

	//�л���������
	private void changePanel(CommonPanel commonPanel) {
		//�Ƴ���ǰ��ʾ��JPanel
		this.remove(currentPanel);
		//�����Ҫ��ʾ��JPanel
		this.add(commonPanel);
		//���õ�ǰ��JPanel
		this.currentPanel = commonPanel;
		this.repaint();
		this.setVisible(true);
		//���¶�ȡ����
		commonPanel.setViewDatas();
		//��ձ�
		commonPanel.clear();
	}
	
}
