package socket.udp.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send implements Runnable{
	private DatagramSocket ds;
	public Send(DatagramSocket ds) {
		this.ds=ds;
	}

	@Override
	public void run() {
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		try {
			while((line=bufr.readLine())!=null){
				byte[] buf=line.getBytes();
				DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("10.66.78.1"),10001);
				//3.通过udp的socket服务将数据包发送出去
				ds.send(dp);
				if("over".equals(line))
					break;
			}
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
