package MapSet.App;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		Set<String> countries = new HashSet<>();

		countries.add("India");
		countries.add("USA");
		countries.add("canada");
		countries.add("Engaland");
		countries.add("australia");
		countries.add("Indian");
		System.out.println(countries);

		for (String name : countries) {
			System.out.println("Countries name : " + name);
		}
		System.out.println(countries.contains(1));
	}
}
