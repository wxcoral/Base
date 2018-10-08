package designpatterns.adapter.multipleadapter;

public interface IWorkerAdapter {
	String work(Object worker);
	boolean isSupports(Object worker);
}
