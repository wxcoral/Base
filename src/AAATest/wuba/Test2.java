package AAATest.wuba;
/**
 * 击鼓传花游戏：总共m个人围成一圈，编号从1开始。从第一个人开始传递一朵花，当传递到第n次时，持花者
 * 出局，下一个人重新计数传递，重复知道所有人都出局。请给出按照原始编号的出局顺序。
 * 例：有7个人参加游戏，每次传到6时出局，则出局顺序为[6,5,7,2,1,4,3]
 * @author Administrator
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(get(7, 6).toString());
	}
	public static List<Integer> get(int totalNum,int countNum){
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> result=new ArrayList<Integer>();
		for(int i=1;i<=totalNum;i++){
			list.add(i);
		}
		
		int index=0;
		while(list.size()>0){
			for(int i=1;i<=countNum;i++){
				index++;
				if(index>list.size()){
					index=1;
				}
				if(i==countNum){
					int remove=list.remove(index-1);
					result.add(remove);
					index--;
				}
				
			}
		}
		return result;	
			
	}
}

