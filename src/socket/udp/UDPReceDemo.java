package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 建立udp接收端思路
		 * 1、建立udp的socket服务
		 * 2、创建数据包用于存储接收到的数据
		 * 3、使用socket服务的receive方法将接收到的数据存储到数据包中
		 * 4、通过数据包的方法解析数据包中的数据
		 * 5、关闭资源
		 */
		System.out.println("接收端启动.....");
		DatagramSocket ds=new DatagramSocket(10000);
		//创建数据包
		while(true){
			byte[] buf=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf, buf.length);
			//使用接收方法将数据存储到数据包中
			ds.receive(dp);
			
			String ip=dp.getAddress().getHostAddress();
			int port=dp.getPort();
			String text=new String(dp.getData(),0,dp.getLength());
			
			System.out.println(ip+":"+port+":"+text);
		}
		//ds.close();
		
	}
}
