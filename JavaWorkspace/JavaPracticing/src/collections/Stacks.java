package collections;
import java.util.ArrayDeque;
import java.util.Deque;

public class Stacks {
	public static void main(String[] args) {
		Deque<String> books = new ArrayDeque<String>();
		
		
		books.add("The Antichrist");
		books.push("The Prince");
		
		System.out.println(books.peek());
		System.out.println(books.peek());

	}
	
}
