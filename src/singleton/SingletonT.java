package singleton;

public class SingletonT {
	
	//����ģʽ������ģʽ���̰߳�ȫ��
	private static SingletonT singletonT = new SingletonT();
	private SingletonT() {};
	private static SingletonT getInstace() {
		return singletonT;
	}
}
