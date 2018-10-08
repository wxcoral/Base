import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/*
 * 有k次机会将0替换成1，求最长1子串
 */

public  class  Main {  
	public static void main(String[] args) {
		int[] prices={2,4,6,8,10};
		System.out.println(maxProfit(prices));
	}
	
    public static int maxProfit(int[] prices) {
        int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE;
        int release1 = 0, release2 = 0;
        for(int i:prices){                              // Assume we only have 0 money at first
        	release1 = Math.max(release1, hold1+i);     // 如果我们刚刚卖出第一只股票。
            hold2    = Math.max(hold2,    release1-i);  // 如果我们刚刚买入第二只股票。
            release2 = Math.max(release2, hold2+i);     // 如果我们刚刚卖出第二只股票。
            hold1    = Math.max(hold1,    -i);          // 如果我们刚刚买入第一只股票。
        }
        return release2; ///Since release1 is initiated as 0, so release2 will always higher than release1.
    }
}





	