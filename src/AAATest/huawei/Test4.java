package AAATest.huawei;

import java.util.Scanner;

public class Test4{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		double price=in.nextDouble();
		double sum1=price*num;
		int a=(int)price*num/10;
		double sum2=price*num-2*a;
		
		if(num>=3)
			sum1*=0.7;
		if(sum1<50)
			sum1+=10;
		
		if(sum2<99)
			sum2+=6;
		
		if(sum1<sum2){
			System.out.println(1);
		}else if(sum1>sum2){
			System.out.println(2);
		}else {
			System.out.println(0);
		}
	}
}

