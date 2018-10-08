package designpatterns.adapter.multipleadapter;

import designpatterns.adapter.ICooker;
import designpatterns.adapter.IProgrammer;

public class ProgrammerAdapter implements IWorkerAdapter {

	@Override
	public String work(Object worker) {
		return ((IProgrammer)worker).program();
	}

	@Override
	public boolean isSupports(Object worker) {
		return (worker instanceof IProgrammer);
	}

}
