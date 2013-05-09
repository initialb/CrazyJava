package org.crazyit.tetris.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * һ�������һ��������������
 * @author yangenxiong
 *
 */
public class Piece {

	//�ô󷽿���������С����
	private List<Square> squares;
	//�ô󷽿�ı仯
	protected List<List<Square>> changes = new ArrayList<List<Square>>();
	
	protected Random random = new Random();
	//��ǰ�仯����������changes�����е�������
	protected int currentIndex;
	//ÿ��С��ı߳�
	public final static int SQUARE_BORDER = 16;
	
	public List<Square> getSquares() {
		return squares;
	}

	public void setSquares(List<Square> squares) {
		this.squares = squares;
	}

	public List<Square> getDefault() {
		//��changes����������õ�����һ�ֱ仯
		int defaultChange = random.nextInt(changes.size());
		//���õ�ǰ�仯������
		this.currentIndex = defaultChange;
		return changes.get(defaultChange);
	}

	public void change(){
		if (this.changes.size() == 0) return;
		this.currentIndex += 1;
		//�����ǰ�仯����changes���ϵĴ�С, ���0��ʼ�仯
		if (this.currentIndex >= this.changes.size()) this.currentIndex = 0; 
		this.squares = this.changes.get(this.currentIndex);
	}

	//��Piece�����е�����Square�����x���궼���ϲ���x
	public void setSquaresXLocation(int x) {
		for (int i = 0; i < this.changes.size(); i++) {
			List<Square> change = this.changes.get(i);
			for (int j = 0; j < change.size(); j++) {
				Square s = change.get(j);
				s.setBeginX(s.getBeginX() + x);
			}
		}
	}
	//��Piece�����е�����Square�����y���궼���ϲ���y
	public void setSquaresYLocation(int y) {
		for (int i = 0; i < this.changes.size(); i++) {
			List<Square> change = this.changes.get(i);
			for (int j = 0; j < change.size(); j++) {
				Square s = change.get(j);
				s.setBeginY(s.getBeginY() + y);
			}
		}
	}
	
	//�õ���ǰ�仯��x��������ֵ
	public int getMaxXLocation() {
		int result = 0;
		for (int i = 0; i < this.squares.size(); i++) {
			Square s = this.squares.get(i);
			if (s.getBeginX() > result) result = s.getBeginX();
		}
		return result + SQUARE_BORDER;
	}
	
	//�õ���ǰ�仯��x�������Сֵ
	public int getMinXLocation() {
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < this.squares.size(); i++) {
			Square s = this.squares.get(i);
			if (s.getBeginX() < result) result = s.getBeginX();
		}
		return result;
	}
	
	//�õ���ǰ�仯��Y�������ֵ
	public int getMaxYLocation() {
		int result = 0;
		for (int i = 0; i < this.squares.size(); i++) {
			Square s = this.squares.get(i);
			if (s.getBeginY() > result) result = s.getBeginY();
		}
		return result + SQUARE_BORDER;
	}
	
	//�õ���ǰ�仯��Y������Сֵ
	public int getMinYLocation() {
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < this.squares.size(); i++) {
			Square s = this.squares.get(i);
			if (s.getBeginY() < result) result = s.getBeginY();
		}
		return result + SQUARE_BORDER;
	}
}
