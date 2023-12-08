package exercises;
import java.util.Scanner;

public class ForEachExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many grades are going to be calculated?");
		int quantity = sc.nextInt();
		
		double[] grades = new double[quantity];
		
		for(int i =0; i < grades.length; i++) {
			System.out.printf("Please type the grade number %d:", (i + 1));
			grades[i] = sc.nextDouble();
		
		}
		
		double total = 0;
		for(double grade: grades) {
			total += grade;
		}
		
		System.out.printf("Final grade: %.1f", (total / grades.length) );
		
		
		
		
		sc.close();
		
	}
}
