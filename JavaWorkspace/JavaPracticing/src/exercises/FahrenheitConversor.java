package exercises;
import java.util.Scanner;
import java.text.DecimalFormat;

public class FahrenheitConversor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Please, type in the Fahrenheit value:" + " ");		
		double fahrenheit = sc.nextDouble();
		
		
		double celcius = (fahrenheit - 32) / 1.8000;
		System.out.println("The value in Celsius is: " + df.format(celcius) + "C°");
	
		sc.close();
	}
	
	
}
