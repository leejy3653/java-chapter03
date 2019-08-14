package chapter03;

public class StringTest03 {

	public static void main(String[] args) {
		// String Methods.....

		//
		// String s = "Hello " + "World " + 2018;
		// String Buffer
		StringBuffer sb = new StringBuffer("");
		sb.append("Hello ");
		sb.append("World ");
		sb.append(2018);

		System.out.println(sb);

		// 주의 : + 연산자로 문자열을 더할 때
//		String s2 = "";
//		for (int i = 0; i < 1000000; i++) {
//			s2 = s2 + i;
//			// s2 = new StringBuffer(s2).append(i).toString();

//		}
		
		StringBuffer sb2 = new StringBuffer("");
		for (int i = 0; i < 1000000; i++) {
			sb2.append(i);
		}
		

	}

}
