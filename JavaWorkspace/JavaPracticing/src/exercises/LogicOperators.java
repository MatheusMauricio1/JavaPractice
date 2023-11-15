package exercises;

public class LogicOperators {
	public static void main(String[] args) {
		// Work on tuesday (T or F), Work on thursday(T or F). 
		// If i work twice then i'll buy a 50 inches television in the shopping with my family, and i will also buy ice cream for them.
		// If i work only once, then i will buy a 30 inches television in the shopping with my family, and i will also buy ice cream for them
		// If i do not work this week, then i won't buy a tv and i won't take my family out to have a ice cream.
		
		boolean workOnTuesday = false;
		boolean workOnThursday = false;
		boolean fiftyInchesTV = false;
		boolean thirtyInchesTV = false;
		boolean familyIceCream = false;
		
		
		if (workOnTuesday && workOnThursday == true) {
			fiftyInchesTV = true;
			familyIceCream = true;
			thirtyInchesTV = false;
			System.out.println("I went to the shopping with my family and bought a 50 inches TV. While shopping, we all had ice cream.");
		} 
		else if (workOnTuesday == true && workOnThursday == false || workOnTuesday == false && workOnThursday == true) {
			fiftyInchesTV = false;
			thirtyInchesTV = true;
			familyIceCream = true;
			System.out.println("I went to the shopping with my family and bought a 30 inches TV. While shopping, we all had ice cream.");
		}
		else 
		{
			fiftyInchesTV = false;
			thirtyInchesTV = false;
			familyIceCream = false;
			System.out.println("Susan and i are getting a divorce.");
		}
		
		
	}

}
