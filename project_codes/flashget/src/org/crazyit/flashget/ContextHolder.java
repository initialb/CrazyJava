package org.crazyit.flashget;

import org.crazyit.flashget.thread.DownloadHandler;

public class ContextHolder {
	//���ع���������
	public static DownloadContext ctx = new DownloadContext();
	//���ش�����
	public static DownloadHandler dh = new DownloadHandler();
}
