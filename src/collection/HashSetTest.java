package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>(); // 값기반

		String s1 = new String("고길동");
		String s2 = new String("고길동");
		set.add("둘리");
		set.add("마이콜");
		// set.add("둘리"); // 주석 제거해도 중복 안됨
		set.add(s1);
		// set.add(s2); // 13열 고길동 중복
		
		//System.out.println(set.contains("고길동"));
		System.out.println(set.contains(s2));
		
		set.remove(s2); //remove 고길동
		

		// 순회
		for (String s : set) {
			System.out.println(s);
		}
	}

}
