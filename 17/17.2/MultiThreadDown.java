

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
public class MultiThreadDown
{
	public static void main(String[] args) throws Exception
	{
		// ��ʼ��DownUtil����
		final DownUtil downUtil = new DownUtil("http://www.crazyit.org/"
			+ "attachment.php?aid=MTY0NXxjNjBiYzNjN3wxMzE1NTQ2MjU5fGNhO"
			+ "DlKVmpXVmhpNGlkWmVzR2JZbnluZWpqSllOd3JzckdodXJOMUpOWWt0aTJz,"
			, "oracelsql.rar", 4);
		// ��ʼ����
		downUtil.download();
		new Thread()
		{
			public void run()
			{
				while(downUtil.getCompleteRate() < 1)
				{
					// ÿ��0.1���ѯһ���������ɽ��ȣ�
					// GUI�����пɸ��ݸý��������ƽ�����
					System.out.println("����ɣ�" 
						+ downUtil.getCompleteRate());
					try
					{
						Thread.sleep(1000);
					}
					catch (Exception ex){}
				}
			}
		}.start();
	}
}
