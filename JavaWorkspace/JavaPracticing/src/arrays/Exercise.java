package arrays;

import java.util.Arrays;

public class Exercise {
	public static void main(String[] args) {
		double[] studentGrades = new double[3];
		studentGrades[0] = 7.0;
		studentGrades[1] = 5.0;
		studentGrades[2] = 8.0;

		System.out.println(Arrays.toString(studentGrades));

		double total = 0;
		for(int i =0; i < studentGrades.length; i++) {
			total += studentGrades[i];
		}
		
		System.out.printf("%.1f\n", (total / studentGrades.length));
		
		double[] studentBgrades = {7.0, 8.0, 5.0, 4.0};
		
		double totalB = 0;
		for(int i =0; i < studentBgrades.length; i++) {
			totalB += studentBgrades[i];
		}
		System.out.printf("%.1f", (totalB / studentBgrades.length));
		
	}
}	
