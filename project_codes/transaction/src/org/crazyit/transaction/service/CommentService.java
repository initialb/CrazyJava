package org.crazyit.transaction.service;

import org.crazyit.transaction.model.Comment;

public interface CommentService {

	/**
	 * ����һ����������
	 * @param comment ���۶���
	 */
	void save(Comment comment);
}
