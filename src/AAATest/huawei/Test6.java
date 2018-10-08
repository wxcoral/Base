package AAATest.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 两个实现大数的相乘
 * @author Administrator
 *
 */
public class Test6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		int[] num1=new int[s1.length()];
		int m=num1.length;
		int[] num2=new int[s2.length()];
		int n=num2.length;
		for(int i=0;i<s1.length();i++){
			num1[i]=s1.charAt(i)-'0';
		}
		for(int i=0;i<s2.length();i++){
			num2[i]=s2.charAt(i)-'0';
		}
		
		
		List<int[]> list=new ArrayList<int[]>();
		for(int i=n-1;i>=0;i--){
			int pre=0;
			int[] accu=new int[m+n];   //长度为m+n,空位补0
			for(int j=m-1;j>=0;j--){
				int ac=num1[j]*num2[i];
				if(pre>0){          //判断前一位是否有进位
					ac+=pre;
					pre=0;
				}   
				if(ac>9){           //判断此位是否向前进位
					pre=ac/10;   
					accu[i+j+1]=ac%10;
				}else{
					accu[i+j+1]=ac;
				}
			}
			//最后一位往前进位
			accu[i]=pre;
			list.add(accu);
		}
		
		//所有accu相加存入字符串数组中
		int[] result=new int[m+n+1];
		int pre=0;
		for(int i=m+n-1;i>=0;i--){
			int sum=0;
			for (int[] is : list) {
				sum+=is[i];
			}
			if(pre>0){
				sum+=pre;
				pre=0;
			}
			if(sum>9){
				pre=sum/10;
				result[i+1]=sum%10;
			}else{
				result[i+1]=sum;
			}
		}
		result[0]=pre;
		
		//输出result，去掉首位的零
		int zerolen=0;
		for(int i=0;i<result.length;i++){
			if(result[i]==0){
				zerolen++;
			}else{
				break;
			}
		}
		//把数组变为字符串输出
		StringBuilder sb=new StringBuilder();
		for(int i=zerolen;i<result.length;i++){
			sb.append(result[i]);
		}
		System.out.println(sb.toString());
	}

}
