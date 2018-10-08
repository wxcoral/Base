package designpatterns.adapter.multipleadapter;

import java.util.ArrayList;
import java.util.List;

import designpatterns.adapter.ICooker;
import designpatterns.adapter.IProgrammer;
import designpatterns.adapter.JdProgrammer;
import designpatterns.adapter.QjdCooker;
import designpatterns.adapter.singleadapter.WorkerAdapter;
import jdk.internal.org.objectweb.asm.commons.GeneratorAdapter;

public class MyTest {

	public static void main(String[] args) {
		ICooker qjdCooker=new QjdCooker();
		IProgrammer jdProgrammer=new JdProgrammer();
		
		Object[] workers={qjdCooker,jdProgrammer};
		for (Object worker : workers) {
			IWorkerAdapter adapter=getAdapter(worker);
			System.out.println(adapter.work(worker));
		}
	}
	
	//根据worker获取相应的适配器对象
	private static IWorkerAdapter getAdapter(Object worker) {
		List<IWorkerAdapter> adapters=getAllAdapters();
		for (IWorkerAdapter adapter : adapters) {
			if(adapter.isSupports(worker)==true){
				return adapter;
			}
		}
		return null;
	}
	
	//获取所有的适配器
	private static List<IWorkerAdapter> getAllAdapters() {
		List<IWorkerAdapter> adapters=new ArrayList<IWorkerAdapter>();
		adapters.add(new CookerAdapter());
		adapters.add(new ProgrammerAdapter());
		return adapters;
	}

}
