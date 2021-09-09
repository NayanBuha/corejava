package Collection.Demo;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>();
		set.add("Apple");
		set.add("Bannana");
		set.add("Coconut");
		set.add("Orange");
		set.add("Pineapple");
		
		for(String fruit:set) {
			System.out.println(fruit);
		}
	}
}
