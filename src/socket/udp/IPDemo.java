package socket.udp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());
	}

}
