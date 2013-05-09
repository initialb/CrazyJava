package org.crazyit.book.service.impl;

import java.util.Collection;

import org.crazyit.book.dao.ConcernDao;
import org.crazyit.book.service.ConcernService;
import org.crazyit.book.vo.Concern;

public class ConcernServiceImpl implements ConcernService {

	private ConcernDao dao;
		
	//��ֵע����Ҫ��setter����
	public void setConcernDao(ConcernDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Collection<Concern> getAll() {
		return dao.findAll();
	}

	@Override
	public Concern find(String id) {
		return dao.find(id);
	}

	@Override
	public Concern add(Concern c) {
		String id = dao.add(c);
		return find(id);
	}

	@Override
	public Concern update(Concern c) {
		//����DAO�����޸Ķ���
		String id = dao.update(c);
		//���²��Ҹö���
		return find(id);
	}

	@Override
	public Collection<Concern> query(String name) {
		return dao.findByName(name);
	}

}
