package AAATest.wangyi;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import sun.tools.jar.resources.jar;
/**
 * 翻牌
 * @author Administrator
 *
 */
public class Task5 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int[] result=new int[t];
		for(int i=0;i<t;i++){
			int[][] arr=new int[in.nextInt()][in.nextInt()];
			result[i]=get(arr);
		}
		
		for (int i : result) {
			System.out.println(i);
		}
	}
	public static int get(int[][] arr){
		if(arr.length==1&&arr[0].length==1){
			return 1;
		}
		else if(arr.length==1){
			return arr[0].length-2;
		}
		else if(arr[0].length==1){
			return arr.length-2;
		}
		else {
			return (arr.length-2)*(arr[0].length-2);
		}	
	}
}
