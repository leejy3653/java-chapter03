package chapter03;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('A');
		Boolean b = new Boolean(true);

		System.out.println(i);
		System.out.println(c);
		System.out.println(b);

		// Auto Boxing이 일어남 (그냥 써도 됨)
		Integer i2 = 10;
		Integer i3 = 20;
		System.out.println(i2 == i3);

		// Auto Unboxing
		// int j = 20 + i2.intValue(); // 원래는 이런식으로 써야 하지만
		int j = 20 + i2; // 이렇게 써도 됨 (Auto Unboxing)
		

	}

}
