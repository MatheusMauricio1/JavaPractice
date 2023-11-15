package exercises;
import java.util.Scanner;

public class SquareCubeExponential {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please type a number: ");
		double num1 = sc.nextDouble();
		
		double square = Math.pow(num1, 2);
		double cube = Math.pow(num1, 3);
		
		System.out.printf("Exponential 2: %s, and Exponential 3: %s ", (int) square, (int) cube);
		
		sc.close();
	}
}
