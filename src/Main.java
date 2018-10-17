import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 有k次机会将0替换成1，求最长1子串
 */

public  class  Main { 
	public static void main(String[] args){
				String s1="hello";
				String s2="he";
				String s3="llo";
				String s4=new String("he");
				String s5=new String("llo");
				
				String s6="he"+"llo";
				String s7="he"+new String("llo");
				String s8=s4+s5;
				
				String s9=s2+s5;
				System.out.println(s9==s7);
				
				System.out.println(s1==s6);
				System.out.println(s6==s7);
				System.out.println(s6==s8);
				System.out.println(s7==s8);
			}
		}