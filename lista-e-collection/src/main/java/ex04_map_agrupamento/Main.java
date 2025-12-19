package ex04_map_agrupamento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		List<Produto> produtos = List.of(new Produto("Arroz", "Alimentos"), 
				new Produto("Feijao", "Alimentos"),
				new Produto("Sabao", "Limpeza"));

		Map<String, List<Produto>> map = new HashMap<>();

		for (Produto p : produtos) {
			map.computeIfAbsent(p.categoria, k -> new ArrayList<>()).add(p);
		}

		map.forEach((k, v) -> System.out.println(k + " -> " + v.size()));
	}
}