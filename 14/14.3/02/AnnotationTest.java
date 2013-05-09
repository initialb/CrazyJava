
import java.awt.event.*;
import javax.swing.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class AnnotationTest
{
	private JFrame mainWin = new JFrame("ʹ��ע�Ͱ��¼�������");
	// ʹ��AnnotationΪok��ť���¼�������
	@ActionListenerFor(listener=OkListener.class)
	private JButton ok = new JButton("ȷ��");
	// ʹ��AnnotationΪcancel��ť���¼�������
	@ActionListenerFor(listener=CancelListener.class)
	private JButton cancel = new JButton("ȡ��");
	public void init()
	{
		// ��ʼ������ķ���
		JPanel jp = new JPanel();
		jp.add(ok);
		jp.add(cancel);
		mainWin.add(jp);
		ActionListenerInstaller.processAnnotations(this);     //��
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new AnnotationTest().init();
	}
}
// ����ok��ť���¼�������ʵ����
class OkListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		JOptionPane.showMessageDialog(null , "������ȷ�ϰ�ť");
	}
}
// ����cancel��ť���¼�������ʵ����
class CancelListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		JOptionPane.showMessageDialog(null , "������ȡ����ť");
	}
}