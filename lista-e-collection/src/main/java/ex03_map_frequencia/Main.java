package ex03_map_frequencia;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String[] dados = { "A", "B", "A", "C", "A", "B" };

		Map<String, Integer> contagem = new HashMap<>();

		for (String d : dados) {
			contagem.put(d, contagem.getOrDefault(d, 0) + 1);
		}

		System.out.println(contagem);
	}
}