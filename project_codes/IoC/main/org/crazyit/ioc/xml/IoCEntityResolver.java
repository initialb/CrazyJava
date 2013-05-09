package org.crazyit.ioc.xml;

import java.io.IOException;
import java.io.InputStream;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * �Զ����EntityResolver
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class IoCEntityResolver implements EntityResolver {

	public InputSource resolveEntity(String publicId, String systemId)
			throws SAXException, IOException {
		//�ӱ���Ѱ��dtd
		if ("http://www.crazyit.org/beans.dtd".equals(systemId)) {
			InputStream stream = IoCEntityResolver.class.
			getResourceAsStream("/org/crazyit/ioc/beans/beans.dtd");
			return new InputSource(stream);
		} else {
			return null;
		}
	}

}
