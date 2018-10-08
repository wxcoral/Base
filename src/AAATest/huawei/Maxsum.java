package AAATest.huawei;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Maxsum {
	public static void main(String[] args) {
		int arr[]={2,-3,4,11,-5,8,3,-6};
		int Maxsum=getMax(arr);
		System.out.println(Maxsum);
	}
	/*
	 * 获取数组中所有元素之和
	 */
	public static int getSum(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	
	public static int getMax(int[] arr){
		int max=getSum(arr);
		List list=new ArrayList();
		for(int i=1;i<=arr.length;i++){
			for(int j=0;j<=arr.length-i;j++){
				int[] newArr=Arrays.copyOfRange(arr, j,j+i);
				//String s=Arrays.toString(newArr);
				//System.out.print(s);
				int sum=getSum(newArr);
				//System.out.println(sum);
				list.add(sum);
			}
			
		}
		Iterator it=list.iterator();
		while(it.hasNext()){
			int c=(int)it.next();
			if(max<=c)
				max=c;
		}
		return max;
	}
}
