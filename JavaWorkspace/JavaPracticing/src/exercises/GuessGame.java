package exercises;

import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		/*
		 * Just a game that a person has to guess which number is the right one between 0 up to 100 within only 10 guesses.
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);

		int numberToBeGuessed = 47;
		int answer = 0;
		int counter = 10;
		
		System.out.println("Welcome! This is a game which you will have to guess the right number between 0 up to 100.");
		
		do {
				System.out.printf("Please, type a number, you have %d guesses left!: ", counter);
				answer = sc.nextInt();
			 	counter--;
			 	
		}while(answer != numberToBeGuessed && counter != 0);
		
		if(answer == numberToBeGuessed) {
			System.out.println("Congrats! You've guessed the right number!");
		}
		else {
			System.out.println("Oops! Too bad, you did not guess it right this time.");
		}
		sc.close();
		
	}
}
