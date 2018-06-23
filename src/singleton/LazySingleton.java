package singleton;

public class LazySingleton {
	
	//懒汉模式，非线程安全，需要自己写同步线程
	private static LazySingleton lazySingleton;
	
	//私有构造方法，防止重新new
	private LazySingleton() {};
	
	private synchronized static LazySingleton getInstance() {
		if(lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
	
	private static LazySingleton getInstance1() {
		if(lazySingleton == null) {
			synchronized(LazySingleton.class) {
				if(lazySingleton == null) {
					lazySingleton = new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}
	
}
