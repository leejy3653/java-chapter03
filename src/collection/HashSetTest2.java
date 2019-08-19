package collection;

import java.util.HashSet;

public class HashSetTest2 {

	public static void main(String[] args) {
		HashSet<Money> s = new HashSet<Money>();

		s.add(new Money(1));
		s.add(new Money(2));
		s.add(new Money(3));
		s.add(new Money(1));

		for (Money m : s) {
			System.out.println(m);
			
			//1. hashcode 비교 1,2,3
			//2. equals 비교  1
		}

	}

}
