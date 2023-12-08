package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
	public static void main(String[] args) {
		Queue<String> line = new LinkedList<>();
		
		line.add("Ana");
		line.offer("Yasir");
		line.offer("Mia");
		line.add("Mu");
		
		System.out.println(line.peek());
		System.out.println(line.element());

	}
}
