package AAATest.huawei;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class GetString {
	public static void main(String[] args){
		List list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入...");
		String input=sc.nextLine();
		String reg="\\[|\\]+";
		String[] s=input.split(reg);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length;i++){
				sb.append(s[i]);
			}
		String str=sb.toString();
		char[] ch=str.toCharArray();		
		for(int j=0;j<ch.length;j++){
			if(ch[j]>='1'&&ch[j]<='9'){
				list.add(j);
			}
		}
		
		for(int k=0;k<list.size();k++){
			
		}
			
	}
}
