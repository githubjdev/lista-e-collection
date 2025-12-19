package ex02_set_deduplicacao;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> emails = new HashSet<>();

		emails.add("a@teste.com");
		emails.add("b@teste.com");
		emails.add("a@teste.com");

		System.out.println(emails);
	}
}