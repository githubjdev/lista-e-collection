package ex01_list_removeif;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Pedido> pedidos = new ArrayList<>();
		pedidos.add(new Pedido("P1", "OK"));
		pedidos.add(new Pedido("P2", "CANCELADO"));
		pedidos.add(new Pedido("P3", "OK"));
		pedidos.add(new Pedido("P4", "CANCELADO"));

		pedidos.removeIf(p -> "CANCELADO".equals(p.getStatus()));

		pedidos.forEach(System.out::println);
	}

}