package chapter03;

public class StringTest03 {

	public static void main(String[] args) {
		// String Methods.....
		String s = "aBcABCabcAbc";
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("abc", 7));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 5));

		String s2 = "        ab cd      ";
		String s3 = "efg,hij,lmn,opq";
		String s4 = s2.concat(s3);

		System.out.println(s4);
		System.out.println("----" + s2.trim() + "-----"); // 좌우 스페이스 제거
		System.out.println("----" + s2.replaceAll(" ", "") + "-----"); // 모든 공백 제거

		String[] tokens = s3.split(",");
		for (String str : tokens) {
			System.out.println(str);
		}

		tokens = s3.split(";");
		for (String str : tokens) {
			System.out.println(str);
		}

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
