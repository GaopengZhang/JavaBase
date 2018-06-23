package random;

import java.util.Random;

public class RandomT {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt(100));	//每次返回结果不一样
		
		Random random2 = new Random(100);	//带种子，每次返回结果都一样
		System.out.println(random2.nextInt(100));
	}
}
