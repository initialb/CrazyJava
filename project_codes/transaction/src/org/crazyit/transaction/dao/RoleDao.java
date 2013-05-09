package org.crazyit.transaction.dao;

import java.util.List;

import org.crazyit.transaction.model.Role;

public interface RoleDao {

	/**
	 * ����ID���ҽ�ɫ
	 * @param id
	 * @return
	 */
	Role find(String id);
	
	/**
	 * ����ȫ���Ľ�ɫ
	 * @return
	 */
	List<Role> findRoles();
}
