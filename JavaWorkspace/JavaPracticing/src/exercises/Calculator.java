package exercises;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// Read number 1
		// Read number 2
		// Ask user for which operation he wants to use. + - * / %
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please inform the first number: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Please inform the second number: ");
		double num2 = sc.nextDouble();
		
		System.out.print("Ok, and which operation do you want? \nPlease type + for addition, - for subtraction, * for multiplication, / for division "
				+ "and % for module calcultation: ");
		String selection = sc.next().trim();
		
		double calc;
		
		if(selection.equals("+")) {
			calc = num1 + num2;
			System.out.print("The result of the addition is: " + (int) calc);
		}
		else if(selection.equals("-")) {
			calc = num1 - num2;
			System.out.print("The result of the subtraction is: " + (int) calc);
		}
		else if(selection.equals("*")) {
			calc = num1 * num2;
			System.out.print("The result of the ¨multiplication is: " + (int) calc);
		}
		
		else if(selection.equals("/")) {
			calc = num1 / num2;
			System.out.print("The result of the division is: " + (int) calc);
		}
		else if(selection.equals("%")) {
			calc = num1 % num2;
			System.out.printf("The result of %s module %s is: %s", (int) num1, (int) num2, (int) calc);
		}
		else {
			System.out.print("Sorry! But you've typed a wrong operator, please try again.");
		}
		
		sc.close();
	}
}
