package socket.udp.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Rece implements Runnable{
	private DatagramSocket ds;
	public Rece(DatagramSocket ds) {
		this.ds=ds;
	}
	@Override
	public void run() {
		while(true){
			byte[] buf=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf, buf.length);
			//使用接收方法将数据存储到数据包中
			try {
				ds.receive(dp);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			String ip=dp.getAddress().getHostAddress();
			int port=dp.getPort();
			String text=new String(dp.getData(),0,dp.getLength());
			
			System.out.println(ip+":"+port+":"+text);
		}
	}
}
