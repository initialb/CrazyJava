
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class FileVisitorTest
{
	public static void main(String[] args)
		throws Exception
	{
		// ����g:\publish\codes\15Ŀ¼�µ������ļ�����Ŀ¼
		Files.walkFileTree(Paths.get("g:", "publish" , "codes" , "15")
			, new SimpleFileVisitor<Path>()
		{
			// �����ļ�ʱ�򴥷��÷���
			@Override
			public FileVisitResult visitFile(Path file 
				, BasicFileAttributes attrs) throws IOException
			{
				System.out.println("���ڷ���" + file + "�ļ�");
				// �ҵ���FileInputStreamTest.java�ļ�
				if (file.endsWith("FileInputStreamTest.java"))
				{
					System.out.println("--�Ѿ��ҵ�Ŀ���ļ�--");
					return FileVisitResult.TERMINATE;
				}
				return FileVisitResult.CONTINUE;
			}
			// ��ʼ����Ŀ¼ʱ�����÷���
			@Override
			public FileVisitResult preVisitDirectory(Path dir
				, BasicFileAttributes attrs) throws IOException
			{
				System.out.println("���ڷ��ʣ�" + dir + " ·��");
				return FileVisitResult.CONTINUE;
			}
		});
	}
}
