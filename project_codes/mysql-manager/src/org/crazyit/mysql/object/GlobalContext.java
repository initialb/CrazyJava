package org.crazyit.mysql.object;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.crazyit.mysql.database.BackupHandler;
import org.crazyit.mysql.database.impl.BackupHandlerImpl;
import org.crazyit.mysql.object.tree.ServerConnection;
import org.crazyit.mysql.system.PropertiesHandler;
import org.crazyit.mysql.system.impl.PropertiesHandlerImpl;
import org.crazyit.mysql.util.FileUtil;

/**
 * ȫ��������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class GlobalContext {

	//mysql��װĿ¼����·��
	private String mySQLHome;
	
	//�����ļ�����ӿ�
	private PropertiesHandler propertiesHandler = new PropertiesHandlerImpl();
	//���ݽӿ�
	private BackupHandler backHandler = new BackupHandlerImpl();
	
	public GlobalContext(String mySQLHome) {
		this.mySQLHome = mySQLHome;
		//��mySQLHome�ӵ�����������
		Properties props = System.getProperties();
		props.setProperty("mysql.home", mySQLHome);
		System.setProperties(props);
	}
	
	public BackupHandler getBackupHandler() {
		return this.backHandler;
	}
	
	//������з��������ӵļ���
	private Map<String, ServerConnection> connections = new HashMap<String, ServerConnection>();
	
	//���һ�����ӵ�Map��
	public void addConnection(ServerConnection connection) {
		this.connections.put(connection.getConnectionName(), connection);
	}
	
	//��Map��ɾ��һ������
	public void removeConnection(ServerConnection connection) {
		//ɾ�������ӵ������ļ�
		File configFile = new File(FileUtil.CONNECTIONS_FOLDER + 
				connection.getConnectionName() + ".properties");
		configFile.delete();
		this.connections.remove(connection.getConnectionName());
	}
	
	//��Map�л��һ��DatabaseConnection����
	public ServerConnection getConnection(String connectionName) {
		return this.connections.get(connectionName);
	}
	
	//����mySQLHome
	public String getMySQLHome() {
		return this.mySQLHome;
	}
	
	public PropertiesHandler getPropertiesHandler() {
		return this.propertiesHandler;
	}
	
	public Map<String, ServerConnection> getConnections() {
		return this.connections;
	}
}
