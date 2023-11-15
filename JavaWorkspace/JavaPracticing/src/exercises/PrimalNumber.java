package exercises;

import java.util.Scanner;

public class PrimalNumber {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please type a number: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0){
			System.out.println("Not a primal number.");
		}
		else {
			System.out.println("It's a primal number");
		}
		
		
		sc.close();
	}
}
