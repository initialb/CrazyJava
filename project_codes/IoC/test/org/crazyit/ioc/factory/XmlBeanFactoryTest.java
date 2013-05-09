package org.crazyit.ioc.factory;

import junit.framework.TestCase;

import org.crazyit.ioc.beans.factory.XmlBeanFactory;
import org.crazyit.ioc.context.ApplicationContext;

public class XmlBeanFactoryTest extends TestCase {

	ApplicationContext ctx;
	
	protected void setUp() throws Exception {
		ctx = new XmlBeanFactory(new String[]{"/resources/factory/XmlBeanFactory.xml"});
	}

	protected void tearDown() throws Exception {
		ctx = null;
	}
	
	/**
	 * ����bean�Ƿ�������������ʱ�򱻳�ʼ��
	 */
	public void testGetBean() {
		//test1û�б�����, ��������������ʱ��û�б�����
		Object obj = ctx.getBeanIgnoreCreate("test1");
		assertNull(obj);
		obj = ctx.getBean("test1");
		assertNotNull(obj);
	}

}
