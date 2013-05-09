package org.crazyit.linkgame.listener;

import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

import org.crazyit.linkgame.commons.GameConfiguration;
import org.crazyit.linkgame.service.GameService;
import org.crazyit.linkgame.timer.TimerTask;
import org.crazyit.linkgame.view.GamePanel;

import java.util.Timer;

/**
 * ��ʼ��ť������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class BeginListener extends MouseInputAdapter {
	private GamePanel gamePanel;

	private GameService gameService;

	private JLabel pointLabel;

	private JLabel timeLabel;

	private GameConfiguration config;

	private Timer timer;

	private TimerTask task;

	public BeginListener(GamePanel gamePanel, GameService gameService,
			JLabel pointLabel, JLabel timeLabel, GameConfiguration config) {
		this.gamePanel = gamePanel;
		this.gameService = gameService;
		this.pointLabel = pointLabel;
		this.timeLabel = timeLabel;
		this.config = config;
	}

	public Timer getTimer() {
		return this.timer;
	}

	// �������ʱ��ִ���������

	public void mousePressed(MouseEvent e) {
		if (this.timer != null) {
			this.timer.cancel();
		}
		this.timer = new Timer();
		gamePanel.setSelectPiece(null);
		gamePanel.setOverImage(null);
		// ��������0
		pointLabel.setText("0");
		// ��ʱ����ԭ�����õ�ʱ��(��GameConfiguration������)
		timeLabel.setText(String.valueOf(config.getGameTime()));
		// ����gameService��start����

		gameService.start();
		// ��ʼ��������
		task = new TimerTask(this.gamePanel, this.config.getGameTime(),
				this.timeLabel);
		timer.schedule(task, 0, 1000);
		// ��gamePanel�������»���
		gamePanel.repaint();
	}
}
