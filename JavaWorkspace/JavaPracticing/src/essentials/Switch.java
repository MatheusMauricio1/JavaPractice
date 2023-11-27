package essentials;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String concept = "";
		
		System.out.print("Please, type a grade between 0 to 10: ");
		int points = sc.nextInt();
		
		switch(points) {
		case 10: case  9:
			concept = "A";
		break;
		
		case 8: case  7:
			concept = "B";
		break;
		
		case 6: case  5:
			concept = "C";
		break;
		
		case 4: case  3:
			concept = "D";
		break;
		
		case 2: case  1:
			concept = "E";
		break;
		case 0:
			concept = "F";
			break;
		default:
			System.out.println("Invalid value.");
		}
		
		if(points >= 0 && points <= 10) {
			System.out.println("The concept is: " + concept);
		}
		
		sc.close();		
	}
}

