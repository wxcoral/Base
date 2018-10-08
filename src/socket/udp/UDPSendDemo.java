package socket.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPSendDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("发送端启动....");
		//1.建立udp的socket服务
		DatagramSocket ds=new DatagramSocket(8888);
		//2.将要发送的数据封装到数据包中
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=bufr.readLine())!=null){
			if("over".equals(line))
				break;
			byte[] buf=line.getBytes();
			DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("10.66.78.1"),10000);
			//3.通过udp的socket服务将数据包发送出去
			ds.send(dp);
		}
		//4.关闭资源
		ds.close();
		
	}

}
