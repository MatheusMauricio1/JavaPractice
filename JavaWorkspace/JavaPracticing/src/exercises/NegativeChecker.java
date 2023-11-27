package exercises;
import java.util.Scanner;

public class NegativeChecker {
	public static void main(String[] args) {
		/*
		 * Create a program that while it is receiving positive numbers, print in the console the soma of the received positive numbers.
		 * If a negative number is received then it stops
		 * you should use while
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);

		int numbers = 0;
		int insertedNumber = 0;
		
		while(insertedNumber >= 0) {
			System.out.print("Please type a positive value to be added to the Soma List: ");
			insertedNumber = sc.nextInt();
			if(insertedNumber >= 0){
				numbers += insertedNumber;
				System.out.println("Total soma: " + numbers);
			}
			else {
				System.out.println("You've typed a negative value, that ends the program. See ya!");

			}
		}		

		sc.close();
		
		
		
	}
}
