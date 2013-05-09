package org.crazyit.foxmail.object;

import java.util.Comparator;
import java.util.Date;

/**
 * �ʼ�������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class MailComparator implements Comparator {
	//ʵ��compare����
	public int compare(Object o1, Object o2) {
		try {
			//������ǿתΪMail����
			Mail m1 = (Mail)o1;
			Mail m2 = (Mail)o2;
			//����������ڽ��бȽ�
			Date d1 = m1.getReceiveDate();
			Date d2 = m2.getReceiveDate();
			return d2.compareTo(d1);
		} catch (Exception e) {
			return -1;
		}
	}

}
