package thread;
//资源类
class Resource{
	private String name;
	private int count=1;
	private boolean flag=false;
	public synchronized void set(String name){
		while(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.name=name+"---"+count++;
		System.out.println("生产者生产："+this.name);
		flag=true;
		notify();
	}
	public synchronized void out(){
		while(!flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("消费者消费："+this.name);
		flag=false;
		notify();
	}
}

class Producer implements Runnable{
	private static Resource res;
	public Producer(Resource res) {
		this.res=res;
	}
	@Override
	public void run() {
		while(true){
			res.set("商品");			
		}
	}
}

class Consumer implements Runnable{
	private Resource res;
	public Consumer(Resource res) {
		this.res=res;
	}
	@Override
	public void run() {
		while(true){
			res.out();			
		}
	}
}

public class ProCon{
	public static void main(String[] args) {
		Resource res=new Resource();
		Producer pro=new Producer(res);
		Consumer con=new Consumer(res);
		new Thread(pro).start();
		new Thread(con).start();
	}
}
