package org.crazyit.book.ui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * �鿴��ͼƬ��JFrame
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class ImageFrame extends JFrame {

	JLabel imageLabel;
	
	public ImageFrame(ImageIcon image) {
		JPanel mainPanel = new JPanel();
		this.imageLabel = new JLabel();
		this.imageLabel.setIcon(image);
		mainPanel.add(this.imageLabel);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.add(mainPanel);
		this.pack();
		this.setVisible(true);
	}

	public void refresh(ImageIcon image) {
		this.imageLabel.setIcon(image);
		this.setVisible(true);
		super.repaint();
	}
}
