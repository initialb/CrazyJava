package org.crazyit.transaction.ui.handler.impl;

import org.crazyit.transaction.model.Comment;
import org.crazyit.transaction.ui.handler.TransactionHandler;
import org.crazyit.transaction.util.ApplicationContext;

public class ForAWhileHandler implements TransactionHandler {


	public void handler(Comment comment) {
		//��������Ϊ��ʱ����״̬, ��Ҫ�����������״̬, ���������
		ApplicationContext.transactionService.forAWhile(comment.getTRANSACTION_ID(), 
				comment.getUSER_ID(), comment);
//		ApplicationContext.commentService.save(comment);
	}

}
