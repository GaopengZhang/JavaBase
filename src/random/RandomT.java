package random;

import java.util.Random;

public class RandomT {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt(100));	//ÿ�η��ؽ����һ��
		
		Random random2 = new Random(100);	//�����ӣ�ÿ�η��ؽ����һ��
		System.out.println(random2.nextInt(100));
	}
}
