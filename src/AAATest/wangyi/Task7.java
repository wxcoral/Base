package AAATest.wangyi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 有k次机会将0替换成1，求最长1子串
 */
public class Task7 {
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] ss = str.split(",");
		int N = Integer.parseInt(ss[0]);
		int K = Integer.parseInt(ss[1]);
		String s = in.nextLine();*/
        String s="0110001";
        int K=1;
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			int sum=0;
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(j)== '0') {
					sum++;
					if (sum > K) {
						list.add(j-i);
						break;
					}
				}
			}
			if(sum<=K){
				list.add(s.length()-i);
			}

		}
		
		//求集合中的最大值
		int max=list.get(0);
		for (Integer num : list) {
			if(num>max){
				max=num;
			}
		}
		System.out.println(max);
	}
}
	