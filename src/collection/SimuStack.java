package collection;
/**
 * 两个队列模拟一个堆栈，队列是先进先出，而堆栈是先进后出。模拟如下
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SimuStack {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		Queue<String> queue2=new LinkedList<String>();
		ArrayList<String> list=new ArrayList<String>();
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		queue.offer("e");
		System.out.print("进栈：");
		for (String q : queue) {
			list.add(q);
			System.out.print(q);
		}
		for(int j=list.size()-1;j>=0;j--){
			queue2.offer(list.get(j));
		}
		
		System.out.println();
		System.out.print("出栈：");
		for (String q : queue2) {
			System.out.print(q);
		}
	}
}
