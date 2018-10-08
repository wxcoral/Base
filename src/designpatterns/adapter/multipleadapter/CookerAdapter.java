package designpatterns.adapter.multipleadapter;

import designpatterns.adapter.ICooker;

public class CookerAdapter implements IWorkerAdapter {

	@Override
	public String work(Object worker) {
		return ((ICooker)worker).cook();
	}

	@Override
	public boolean isSupports(Object worker) {
		return (worker instanceof ICooker);
	}

}
