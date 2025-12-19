
package ex08_queue_arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) {
		Deque<String> fila = new ArrayDeque<>();
		fila.add("job1");
		fila.add("job2");

		while (!fila.isEmpty()) {
			System.out.println(fila.poll());
		}
	}
}