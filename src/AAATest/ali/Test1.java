package AAATest.ali;

import java.util.Scanner;

/*
 * 输入一个整数数组a，和一个整数k，对于a中每一个元素，必须加k或减k，要使整个数组最大和最小值之差最小，输出差值
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		int k=in.nextInt();
		int[] a=new int[l];
		for(int i=0;i<l;i++){
			a[i]=in.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		int min=a[0]+k;
		int max=a[a.length-1]-k;
		if(min>max){
			int tem=min;
			min=max;
			max=tem;
		}
		
		for(int i=1;i<a.length-1;i++){
			int tmax=a[i]+k;
			int tmin=a[i]-k;
			if(tmin<min&&tmax>max){
				int submin=max-tmin;
				int submax=tmax-min;
				if(submin<submax){
					min=tmin;
				}else {
					max=tmax;
				}	
			}
		}
		
		System.out.println(max-min);
	}

}
