package org.crazyit.ioc.context;


/**
 * ʹ�ø��ഴ��IoC����, ����ʵ��������bean
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class XmlApplicationContext extends AbstractApplicationContext {
		
	
	public XmlApplicationContext(String[] xmlPaths) {
		//��ʼ���ĵ���Ԫ��
		setUpElements(xmlPaths);
		//����beanʵ��
		createBeans();
	}
}
