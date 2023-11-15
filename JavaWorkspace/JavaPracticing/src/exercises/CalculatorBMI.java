package exercises;
import java.util.Scanner;

public class CalculatorBMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please inform your weight(in kg): ");
		double userWeight = sc.nextDouble();
		
		System.out.print("Ok, now please inform your height(in meters): ");
		String userHeight = sc.next().replaceAll(",", ".");
		
		double userHeightSquare = Math.pow(Double.parseDouble(userHeight), 2);
		
		double result = userWeight / userHeightSquare;
		
		if(result < 17) {
			System.out.printf("Your BMI is: %.2f, and you are way below the recommended weight.", result);
		}
		else if (result >= 17 && result <= 18.49) {
			System.out.printf("Your BMI is: %.2f, and you are below the recommended weight.", result);

		}
		else if (result >= 18.5 && result <= 24.99) {
			System.out.printf("Your BMI is: %.2f, and you are in a recommended weight.", result);

		}
		else if (result >= 25 && result <= 29.99) {
			System.out.printf("Your BMI is: %.2f, and you are above the recommended weight.", result);

		}
		else if (result >= 30 && result <= 34.99) {
			System.out.printf("Your BMI is: %.2f, and you have Obesity I.", result);

		}
		else if (result >= 35 && result <= 39.99) {
			System.out.printf("Your BMI is: %.2f, and you have Obesity II(severe). ", result);

		}
		else
			System.out.printf("Your BMI is: %.2f, and you have Obesity III(morbid).", result);
		sc.close();
	}
}
