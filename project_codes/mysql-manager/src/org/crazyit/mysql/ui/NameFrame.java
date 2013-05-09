package org.crazyit.mysql.ui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * �û�Ϊ��ͼ���ߴ洢�����������ֵ�JFrame
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class NameFrame extends JFrame {
	
	private Box mainBox = Box.createVerticalBox();
	
	private Box nameBox = Box.createHorizontalBox();
	
	private Box buttonBox = Box.createHorizontalBox();
	
	private JLabel nameLabel = new JLabel("���ƣ�");
	
	private JTextField nameField = new JTextField(20);
	
	private JButton confirmButton = new JButton("ȷ��");
	
	private JButton cancelButton = new JButton("ȡ��");
	
	private CommonFrame commonFrame;
	
	public NameFrame(CommonFrame commonFrame) {
		this.commonFrame = commonFrame;
		this.nameBox.add(Box.createHorizontalStrut(20));
		this.nameBox.add(this.nameLabel);
		this.nameBox.add(this.nameField);
		this.nameBox.add(Box.createHorizontalStrut(20));
		this.buttonBox.add(Box.createHorizontalStrut(40));
		this.buttonBox.add(this.confirmButton);
		this.buttonBox.add(Box.createHorizontalStrut(20));
		this.buttonBox.add(this.cancelButton);
		this.buttonBox.add(Box.createHorizontalStrut(20));
		
		this.mainBox.add(Box.createVerticalStrut(20));
		this.mainBox.add(this.nameBox);
		this.mainBox.add(Box.createVerticalStrut(20));
		this.mainBox.add(this.buttonBox);
		this.mainBox.add(Box.createVerticalStrut(20));
		this.add(this.mainBox);
		this.setLocation(350, 200);
		this.setResizable(false);
		this.pack();
		initListeners();
	}
	
	private void initListeners() {
		this.confirmButton.addActionListener(new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				confirm();
			}
		});
		this.cancelButton.addActionListener(new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
	
	private void confirm() {
		if (this.nameField.getText().trim().equals("")) {
			showMessage("����������", "����");
			return;
		}
		this.commonFrame.confirm(this.nameField.getText());
	}
	
	private int showMessage(String s, String title) {
		return JOptionPane.showConfirmDialog(this, s, title,
				JOptionPane.OK_CANCEL_OPTION);
	}
}
