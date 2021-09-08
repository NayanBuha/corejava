package Iterator.App;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {

		List<String> value = new LinkedList<>();
		value.add("Hello");
		value.add("World");
		value.add("Nayan");
		value.add("India");
		new App().printList(value);
	}

	void printList(List<String> list) {

		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Elements : " + iterator.next());
		}
	}
}
