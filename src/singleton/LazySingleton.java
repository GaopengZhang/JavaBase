package singleton;

public class LazySingleton {
	
	//����ģʽ�����̰߳�ȫ����Ҫ�Լ�дͬ���߳�
	private static LazySingleton lazySingleton;
	
	//˽�й��췽������ֹ����new
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
