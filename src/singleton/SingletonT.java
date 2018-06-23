package singleton;

public class SingletonT {
	
	//饿汉模式，这种模式是线程安全的
	private static SingletonT singletonT = new SingletonT();
	private SingletonT() {};
	private static SingletonT getInstace() {
		return singletonT;
	}
}
