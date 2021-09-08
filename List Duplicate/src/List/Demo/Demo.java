package List.Demo;

import java.util.HashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("A");
		set.add("C");
		set.add("E");
		set.add("E");
		set.add("E");

		for (String name : set) {
			System.out.println(name);
		}
	}
}
