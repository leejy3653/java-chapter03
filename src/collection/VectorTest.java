package collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		List<String> list = new Vector<String>();

		list.add("들리");
		list.add("마이콜");
		list.add("또치");

		// 순회 1
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}

		// 순회 2 / 한번 순회하면 새로운 iterator가 필요
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		// 순회 3 (for~each)
		for (String s : list) {
			System.out.println(s);
		}

	}

}
