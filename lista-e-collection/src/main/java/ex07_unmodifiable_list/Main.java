package ex07_unmodifiable_list;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<String> dados = new ArrayList<>(List.of("A", "B", "C"));
		List<String> imutavel = Collections.unmodifiableList(dados);

		System.out.println(imutavel);
	}
}