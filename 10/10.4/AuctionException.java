

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class AuctionException extends Exception
{
	//无参数的构造器
	public AuctionException(){}       //①
	//带一个字符串参数的构造器
	public AuctionException(String msg)    //②
	{
		super(msg);
	}
}
