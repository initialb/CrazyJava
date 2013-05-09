package org.crazyit.ioc.context;

/**
 * �����ӿ�
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public interface ApplicationContext {
	/**
	 * ����id�ҵ�bean
	 * @param id
	 * @return
	 */
	Object getBean(String id);
	/**
	 * IoC�������Ƿ����idΪ������bean
	 * @param id
	 * @return
	 */
	boolean containsBean(String id);
	
	/**
	 * �ж�һ��bean�Ƿ�Ϊ��̬
	 * @param name
	 * @return
	 */
	boolean isSingleton(String id);
	
	/**
	 * ���bean, ������������Ҳ�����bean, ����null
	 * @param id
	 * @return
	 */
	Object getBeanIgnoreCreate(String id);
}
