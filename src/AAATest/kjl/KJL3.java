package AAATest.kjl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 假设有这么一种字符串编码规则：k[str]表示k个str，其中k是介于1-9之间的整数。例如3[a]2[bc]等于aaabcbc。
 请编写代码实现自动解码。
 所有的入参都是合法的，即左中括号的前一位必定是数字且不会有孤立的中括号，但是中括号可能会有嵌套，如2[2[k]]等于
 kkkk。输入输出均为字符串
 */
public class KJL3 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入....");
		String input=sc.nextLine();
		System.out.println(getString(input));
	}
	
	//判断一个字符串是否包含中括号
	public static boolean isBracket(String s){
		if(s.contains("[")||s.contains("]"))
			return true;
		return false;
	}
	
	
	public static String getString(String s){
		int a=0;
		String b="";
		String r="";
		List<Integer> i=new ArrayList<Integer>();
		List y=new ArrayList();
		for(int j=0;j<s.length();j++){
			if(Character.isDigit(s.charAt(j))){
				if(a==0){
					String l=s.substring(j, j+1);
					i.add(Integer.parseInt(l));
				}
				else{
					b=b+s.charAt(j);
				}
			}
			
			if(Character.isLetter(s.charAt(j))){
				if(a==0){
					i.add(1);
					y.add(s.charAt(j));
				}
				if(a>0){
					b=b+s.charAt(j);
				}
			}
			
			if(s.charAt(j)=='['){
				if(a>0){
					b=b+s.charAt(j);
				}
				a+=1;
			}
			
			if(s.charAt(j)==']'){
				a-=1;
				if(a>0)
					b=b+s.charAt(j);
				if(a==0){
					y.add(b);
					b="";
				}
			}	
		} 
		
		
		/*
		Iterator it1=i.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
		System.out.println("......");
		Iterator it2=y.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		*/
		
		for(int k=0;k<i.size();k++){
			for(int m=0;m<i.get(k);m++){
				r=r+y.get(k);
			}
		}

		if(isBracket(r)){
			r=getString(r);
		}
		return r;
	}
}
