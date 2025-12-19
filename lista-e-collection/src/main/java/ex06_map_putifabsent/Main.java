package ex06_map_putifabsent;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, String> config = new HashMap<>();

		config.putIfAbsent("lang", "pt-BR");
		config.putIfAbsent("lang", "en-US");

		System.out.println(config);
	}
}