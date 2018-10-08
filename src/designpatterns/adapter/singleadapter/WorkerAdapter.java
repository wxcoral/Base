package designpatterns.adapter.singleadapter;

import designpatterns.adapter.ICooker;
import designpatterns.adapter.IProgrammer;

public class WorkerAdapter implements IWorkerAdapter{

	@Override
	public String work(Object worker) {
		String workContent=null;
		if(worker instanceof ICooker){
			workContent=((ICooker) worker).cook();
		}else if(worker instanceof IProgrammer) {
			workContent=((IProgrammer) worker).program();
		}
		return workContent;
	}

}
