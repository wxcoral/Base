package socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * 服务端接收客户端发送过来的数据，并打印在控制台上
		 * 1、创建服务端socket服务。通过ServerSocket对象
		 * 2、服务端必须对外提供一个端口，否则客户端无法连接
		 * 3、获取连接过来的客户端对象
		 * 4、通过客户端对象获取socket流读取客户端发送来的数据
		 * 5、关闭资源。关闭客户端，关服务端
		 */
		
		ServerSocket ss=new ServerSocket(10002);
		Socket s=ss.accept();
		InputStream in = s.getInputStream();
		byte[] buf=new byte[1024];
		int len=in.read(buf); 
		String text=new String(buf, 0, len);
		System.out.println("server:"+text);
		
		//使用socket输出流向客户端发送数据
		OutputStream os=s.getOutputStream();
		os.write("收到！".getBytes());
		
		s.close();
		ss.close();

	}

}
