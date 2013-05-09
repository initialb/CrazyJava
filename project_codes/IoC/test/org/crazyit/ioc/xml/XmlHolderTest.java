package org.crazyit.ioc.xml;

import junit.framework.TestCase;

import org.dom4j.Document;
import org.dom4j.Element;

public class XmlHolderTest extends TestCase {

	XmlDocumentHolder holder;
	
	protected void setUp() throws Exception {
		holder = new XmlDocumentHolder();
	}

	protected void tearDown() throws Exception {
		holder = null;
	}
	
	public void testGetDoc() {
		String filePath = "test/resources/XmlHolder.xml";
		//���Document����
		Document doc = holder.getDocument(filePath);
		assertNotNull(doc);
		Element root = doc.getRootElement();
		assertEquals(root.getName(), "beans");
		System.out.println(root.getName());
		//���»�ȡһ��, �ж�����Document�����Ƿ�һ��
		Document doc2 = holder.getDocument(filePath);
		System.out.println(doc);
		System.out.println(doc2);
	}

}
