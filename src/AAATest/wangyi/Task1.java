package AAATest.wangyi;

import java.util.Scanner;
/*
 * 在果园里有n堆苹果，每堆苹果的数量为a，求从左往右数第x个苹果是属于哪一堆的
 */
public class Task1 { 
	 public static void main(String[] args) {  
		Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=input.nextInt();
        }
        
        int m=input.nextInt();
        int[] q=new int[m];
        for(int i=0;i<q.length;i++)
        {
            q[i]=input.nextInt();
        }
	 
	      for(int j=0;j<m;j++){
	    	  get(n, a, q[j]);
	      }
	 }  
	 
	 public static void get(int n,int[] a,int q){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
			if(sum>=q){
				System.out.println(i+1);
				break;
			}	
		}
	 }
}
