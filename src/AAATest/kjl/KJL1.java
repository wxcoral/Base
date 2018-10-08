package AAATest.kjl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 给定无序的整数数组，找到第一个缺失的正整数。例如，给定[1,2,0],返回3，给定[3,4,-1,1],返回2
 注意输入输出均为单个字符串
 */
public class KJL1 {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入...");
		String input=sc.nextLine();
		String[] s=input.split(",");
		for(int i=0;i<s.length;i++){
			int num=Integer.parseInt(s[i]);
			if(num>0)
				nums.add(num);
		}
		Collections.sort(nums);
		if(nums.get(0)!=1){
			System.out.println(1);
		}else{
			for(int j=0;j<nums.size();j++){
				if((nums.get(j+1)-nums.get(j))>1)
				{
					System.out.println(nums.get(j)+1);
					break;
				}
			}
		}
		
	}

}

