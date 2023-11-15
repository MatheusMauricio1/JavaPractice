package exercises;
import java.util.Scanner;

public class AverageCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please type the first grade's value: ");
		double gradeOne = sc.nextInt();
		
		System.out.print("Please type the second grade's value: ");
		double gradeTwo = sc.nextInt();
		
		double average = (gradeOne + gradeTwo) / 2;
		
		if(average >= 7.0) {
			System.out.println("Approved");
		}
		else if(average > 4.0 && average < 7.0) {
			System.out.println("Recuperation");
		}
		else {
			System.out.println("Reproved");
		}
		
		sc.close();
		
		
	}
}
