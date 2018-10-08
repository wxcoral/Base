package AAATest.huawei;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.lang.System;

public class KeyBoard {
	public static void main(String[] args) {
		Map<String,String> keyboard=new HashMap<String,String>();
		String[] a={"a","b","c","d","e","f","g","h","i","g","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","G","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[] b={"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m","Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"};
		for(int i=0;i<a.length;i++){
				String key=a[i];
				String value=b[i];
				keyboard.put(key, value);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入信息：");
		String input=sc.nextLine();
		//System.out.println(keyboard.get("A"));
		char[] ch=input.toCharArray();
		for(int i=0;i<ch.length;i++){
			String s=String.valueOf(ch[i]);
			List<String> list=Arrays.asList(a);
			if(list.contains(s)){
				ch[i]=keyboard.get(s).charAt(0);
			}
		}
		String output=new String(ch);
		System.out.println(output);
	}
}
