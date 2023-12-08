package arrays;
import java.util.Scanner;


public class Matrixes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many students?");
		int studentsQnt = sc.nextInt();
		
		System.out.println("How many grades by student?");
		int gradeByStudent = sc.nextInt();
		
		
		double[][] studentsGrades = new double[studentsQnt][gradeByStudent];
		
		double total = 0;
		for (int i = 0; i < studentsGrades.length; i++) {
			for(int j =0; j < studentsGrades[i].length; j++) {
				System.out.printf("Please, inform the %d student's %d grade: ", (j+1), (i+1));
				studentsGrades[i][j] = sc.nextDouble();
				total += studentsGrades[i][j];
			}
		}
		double average = total / (studentsQnt * gradeByStudent);
		System.out.println("Total classroom average is: " + average);
		sc.close();
		
		
		
	}
}
