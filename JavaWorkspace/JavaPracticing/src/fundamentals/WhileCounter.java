package fundamentals;

public class WhileCounter {
	public static void main(String[] args) {			
		int counter = 0;
		int counter2 = 1;
		
		while(counter < 10) {
			counter++;
			System.out.println(counter);
		}
		
		while(counter2 <= 20) {
			counter2 += 2;
			System.out.printf("\ni = %s", counter2);
		}
	
	}
}
