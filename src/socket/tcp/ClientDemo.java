package socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		/**
		 * Tcp传输，客户端建立的过程
		 * 1、创建tcp客户端socket服务。使用的是Socket对象
		 * 建议该对象一创建就明确目的地。要连接的主机
		 * 2、如果连接建立成功，说明数据传输通道已建立
		 * 3、使用输出流，将数据写出
		 * 4、关闭资源
		 */
		
		//创建客户端socket服务
		Socket socket=new Socket("10.66.78.1",10002);
		//获取socket流中的输出流
		OutputStream out=socket.getOutputStream();
		//使用输出流，将数据写出
		out.write("tcp演示".getBytes());
		
		
		
		//使用socket读取流读取服务端返回的数据
		InputStream in=socket.getInputStream();
		byte[] buf=new byte[1024];
		int len=in.read(buf);
		String text=new String(buf, 0, len);
		System.out.println(text);
		
		//关闭资源
		socket.close();
	}

}
