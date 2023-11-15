package exercises;
import java.util.Scanner;

public class TriangleAreaCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Triangle's base: ");
		double triangleBase = sc.nextDouble();
		
		System.out.print("Triangle's height: ");
		double triangleHeight = sc.nextDouble();
		
		
		double areaCalc = (triangleBase * triangleHeight) / 2;
		
		System.out.printf("The area of the triangle is: %s", (int) areaCalc);
		
		sc.close();
	}
}
