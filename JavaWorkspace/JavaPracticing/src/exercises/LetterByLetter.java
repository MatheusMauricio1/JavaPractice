package exercises;
import java.util.Scanner;

public class LetterByLetter {
	public static void main(String[] args) {
		/*
		 * Create a program that receives a single word and shows in the console letter by letter of this word.
		 * */
		Scanner sc = new Scanner(System.in);

		System.out.print("Please, type a word: ");
		String word = sc.next();
				
		for(int a = 0; a < word.length(); a++) {
			System.out.println(word.charAt(a));
		}		
				
		sc.close();	
	}
}
