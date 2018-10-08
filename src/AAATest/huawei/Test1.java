package AAATest.huawei;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入...");
		String input=sc.nextLine();
		StringBuilder output=new StringBuilder();
		for(int i=0;i<input.length();i++){
			char c=input.charAt(i);
			if(c>=65&&c<=90){
				output.append(String.valueOf(c).toLowerCase());
			}else if(c>=97&&c<=122){
				output.append(String.valueOf(c).toUpperCase());
			}else{
				output.append(String.valueOf(c));
			}
		}
		System.out.println(output);
	}

}
