package Collection.Demo;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

		public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("India");
			list.add("USA");
			list.add("UAE");
			list.add("Engaland");
			list.add("Canada");

			for (String name : list) {
				System.out.println("List : " + name);
			}
		}
	}
