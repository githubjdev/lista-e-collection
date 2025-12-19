package ex10_linkedhashmap_ranking;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> pontos = new HashMap<>();
		pontos.put("Ana", 200);
		pontos.put("Bruno", 150);
		pontos.put("Carlos", 180);

		Map<String, Integer> ranking = new LinkedHashMap<>();
		pontos.entrySet()
		       .stream().
		        sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.forEach(e -> ranking.put(e.getKey(), e.getValue()));

		System.out.println(ranking);
	}
}