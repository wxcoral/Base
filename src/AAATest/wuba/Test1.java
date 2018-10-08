package AAATest.wuba;

import java.util.Scanner;

/**
 * 给小朋友分发苹果，见了第一个小朋友把手上的苹果分了一半又多给了一个，第二个小朋友把剩下的苹果分了一半又多给了一次....
 * 见到第9个小朋友的时候，分了剩下的一半又多给了一次，圣诞老人手上还剩下两个苹果，请计算，圣诞老人在给第n个小朋友分苹果之前，手上有多少个苹果
 * @author Administrator
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true){
			System.out.println("请输入此时是第几个小朋友：");
			int child=in.nextInt();
			if(child>0&&child<=9)
				System.out.println(share(child));
			else if(child==0){
				System.exit(0);
			}else{
				System.out.println("输入有误！");
			}
				
		}
		
	}
	//递归
	public static int share(int child){
		if(child==9)
			return 6;
		else
			return 2*(share(child+1)+1);
	}
	
	//非递归
	public static int share2(int child){
		int last=2;
		int first=0;
		for(int i=child;i<=9;i++){
			first=2*(last+1);
			last=first;
			if(child==9)
				break;
		}
		return first;
	}
}
