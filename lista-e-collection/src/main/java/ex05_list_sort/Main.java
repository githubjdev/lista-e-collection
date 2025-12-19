package ex05_list_sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Carlos", 180));
		usuarios.add(new Usuario("Bruno", 150));
		usuarios.add(new Usuario("Ana", 200));

		usuarios.sort(Comparator.comparing(u -> u.nome));
		
		System.out.println(usuarios);
	}
}