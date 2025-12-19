
package ex09_map_merge;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.merge("A", 1, Integer::sum);
		map.merge("A", 2, Integer::sum);

		System.out.println(map);
	}
}