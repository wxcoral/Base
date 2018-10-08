package AAATest.wangyi;
import java.util.Scanner;
/**
 * 完成任务
 * @author Administrator
 *
 */
public class Task4 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] task=new int[3];
		for(int i=0;i<task.length;i++){
			task[i]=in.nextInt();
		}
		
		System.out.println(get(task[0], task[1], task[2]));
	}

	
	public static int get(int i,int j,int k){
		int[] sum=new int[3];
		sum[0]=Math.abs(i-j)+Math.abs(i-k);
		sum[1]=Math.abs(j-i)+Math.abs(j-k);
		sum[2]=Math.abs(k-i)+Math.abs(k-j);
		int min=sum[1];
		for (int l : sum) {
			if(l<min){
				min=l;
			}
		}
		return min;
		
	}

}
