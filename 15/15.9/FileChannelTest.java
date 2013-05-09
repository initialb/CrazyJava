
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
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
public class FileChannelTest
{
	public static void main(String[] args)
	{
		File f = new File("FileChannelTest.java");
		try(
			// ����FileInputStream���Ը��ļ�����������FileChannel
			FileChannel inChannel = new FileInputStream(f).getChannel();
			// ���ļ����������FileBuffer�����Կ������
			FileChannel outChannel = new FileOutputStream("a.txt")
				.getChannel())
		{
			// ��FileChannel���ȫ������ӳ���ByteBuffer
			MappedByteBuffer buffer = inChannel.map(FileChannel
				.MapMode.READ_ONLY , 0 , f.length());   // ��
			// ʹ��GBK���ַ���������������
			Charset charset = Charset.forName("GBK");
			// ֱ�ӽ�buffer�������ȫ�����
			outChannel.write(buffer);     // ��
			// �ٴε���buffer��clear()��������ԭlimit��position��λ��
			buffer.clear();
			// ����������(CharsetDecoder)����
			CharsetDecoder decoder = charset.newDecoder();
			// ʹ�ý�������ByteBufferת����CharBuffer
			CharBuffer charBuffer =  decoder.decode(buffer);
			// CharBuffer��toString�������Ի�ȡ��Ӧ���ַ���
			System.out.println(charBuffer);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
