package Collection.Demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo3 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Nayan");
		map.put(2, "Hiren");
		map.put(3, "Vishal");
		map.put(4, "Jaimin");
		map.put(5, "Mayank");

		Iterator<Entry<Integer, String>> entry = map.entrySet().iterator();
		while (entry.hasNext()) {
			Entry<Integer, String> temp = entry.next();
			System.out.println(temp.getKey() + "  " + temp.getValue());
		}
	}
}
