package socket.tcp.texttrans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TransClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1、创建socket客户端对象
		Socket s=new Socket("10.66.78.1",10003);
		//2、获取键盘录入
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		//3、socket输出流
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		
		//4、socket输入流，读取服务端返回的数据
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line=null;
		while((line=bufr.readLine())!=null){
			if("over".equals(line))
				break;
			out.println(line);
			
			//读取服务端返回的一行大写数据
			String upperStr=bufIn.readLine();
			System.out.println(upperStr);
			
		}
		s.close();
		
	}
}
