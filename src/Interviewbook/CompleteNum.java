package Interviewbook;
//一个数如果恰好等于它的因子之和, 这个数就称”完数” ,例如 6 = 1+2+3,编程找出0-1000以内的所有完数 。
public class CompleteNum {
	public static void main(String[] args) {
		for(int i=2;i<=1000;i++){
			int s=0;
			for(int j=1;j<i;j++){
				if(i%j==0)
					s+=j;
			}
			if(s==i){
				System.out.print(i+" its factors are:");
				for(int k=1;k<i;k++){
					if(i%k==0)
						System.out.print(k+" ");
				}
				System.out.println();
			}
		}
	}
}
