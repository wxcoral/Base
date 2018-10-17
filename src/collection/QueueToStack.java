package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/*
 *两个队列实现一个栈
 */
public class QueueToStack {
	public static void main(String[] args) {
		Queue<Integer> queue1=new LinkedList<Integer>();
		Queue<Integer> queue2=new LinkedList<Integer>();
	
		push(queue1, 1);
		push(queue1, 2);
		push(queue1, 3);
		System.out.println(pop(queue1,queue2));;
		
	}
	
	public static void push(Queue queue,int a){
		queue.add(a);
	}
	
	public static int pop(Queue queue1,Queue queue2){
		((LinkedList<Integer>) queue2).addLast((Integer) queue1.poll());
		return (int) queue2.poll();
	}
	
}
