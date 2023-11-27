package essentials;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String answer = "";
		do {
			System.out.println("Please type 'exit'.");
			answer = sc.next();
			
		} while(!answer.equals("exit"));
			
		sc.close();
	}
}
