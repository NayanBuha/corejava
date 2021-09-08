package MapSet.App;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Nayan");
		map.put(1, "Chaand");
		map.put(7, "Vishal");
		map.put(5, "Hiren");
		map.put(6, "Pooja");
		// map.remove(5);

		System.out.println(map);

		Iterator<Entry<Integer, String>> entry = map.entrySet().iterator();

		while (entry.hasNext()) {
			Entry<Integer, String> temp = entry.next();
			System.out.println("Key : " + temp.getKey() + " Value : " + temp.getValue());
		}
	}
}
