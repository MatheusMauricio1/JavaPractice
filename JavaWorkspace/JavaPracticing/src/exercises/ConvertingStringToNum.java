package exercises;

import java.util.Scanner;

public class ConvertingStringToNum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
				
		System.out.println("Please inform your 1/3 salary of the last three months:");
		String salary1 = s.next().replaceAll(",", ".");
		
		
		System.out.println("Please inform your 2/3 salary of the last three months:");
		String salary2 = s.next().replaceAll(",", ".");
		
		System.out.println("Please inform your 3/3 salary of the last three months:");
		String salary3 = s.next().replaceAll(",", ".");
		
		double soma = Double.parseDouble(salary1) + Double.parseDouble(salary2) + Double.parseDouble(salary3);
		double average = soma / 3;
	
		System.out.printf("Your average salary is: " + "%.3f", average);
		
		s.close();
	}
}
