package designpatterns.adapter.singleadapter;

import designpatterns.adapter.ICooker;
import designpatterns.adapter.IProgrammer;
import designpatterns.adapter.JdProgrammer;
import designpatterns.adapter.QjdCooker;

public class MyTest {

	public static void main(String[] args) {
		ICooker qjdCooker=new QjdCooker();
		IProgrammer jdProgrammer=new JdProgrammer();
		
		Object[] workers={qjdCooker,jdProgrammer};
		IWorkerAdapter adapter=new WorkerAdapter();
		for (Object worker : workers) {
			System.out.println(adapter.work(worker));
		}
	}

}
