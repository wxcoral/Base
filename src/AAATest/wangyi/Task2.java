package AAATest.wangyi;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		
		int[] a=new int[n];
		int[] t=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<t.length;i++){
			t[i]=in.nextInt();
		}
		
		int[] max=new int[a.length];
		int sum=0;
		for(int i=0;i<t.length;i++){
			sum+=a[i]*t[i];
		}
		
		for(int i=0;i<t.length;i++){
			if(t[i]==0){
				max[i]=sum;
				if(i+k>a.length){
					for(int j=i;j<a.length;j++){
						if(t[j]==0){
							max[i]=sum+a[j];
						}
					}
				}else{
					for(int j=i;j<i+k;j++){
						if(t[j]==0){
							max[i]+=a[j];
						}
					}
				}	
			}
		}
		
		int m=0;
		for(int p=0;p<max.length;p++){
			if(max[p]>m){
				m=max[p];
			}
		}
		
		System.out.println(m);
		
	}
}
