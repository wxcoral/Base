package AAATest.kjl;
import java.util.Scanner;


/*
 给定一个非负整数数列，以下规则筛选一个子列：
 每选定一个元素，该元素相邻的两个元素将不可被选取。
 请找出和最大的子列，并输出sum。
 示例：输入数列元素，以空格隔开，注意输入输出均为一个字符串
 输入：3 5 8  
 输出：11
 */
public class KJL2 {
	public static void main(String[] args){
		int maxSum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入...");
		String input=sc.nextLine();
		String[] s=input.split(" ");
		int nums[]=new int[s.length];
		for(int i=0;i<s.length;i++){
			nums[i]=Integer.parseInt(s[i]);
		}
		int first=getSum(nums)-nums[1];
		int last=getSum(nums)-nums[nums.length-2];
		int sum=first>last?first:last;
		for(int j=1;j<nums.length-1;j++){
			if(getSum(nums)-nums[j-1]-nums[j+1]>sum){
				maxSum=getSum(nums)-nums[j-1]-nums[j+1];		
			}else{
				maxSum=sum;
			}
			System.out.println(maxSum);		
		}
	}
	
	public static int getSum(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		return sum;	
	}
}
