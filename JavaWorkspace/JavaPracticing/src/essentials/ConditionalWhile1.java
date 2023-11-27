package essentials;
import java.util.Scanner;

public class ConditionalWhile1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String answer = "";

		
		while(!answer.equals("exit")) {
			System.out.println("Lmao, get f'ed! If you want to leave type 'exit' my dud!");
			answer = sc.next();
		}
				
		sc.close();
		
	}
}
