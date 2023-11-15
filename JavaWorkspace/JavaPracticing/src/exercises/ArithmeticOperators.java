package exercises;

public class ArithmeticOperators {
	public static void main(String[] args) {
		
		int expressionOne = (int) Math.pow(6 * (3 + 2), 2) / (3 * 2);
		
		int expressionTwo = (int) Math.pow((1 - 5) * (2 - 7) / 2, 2);
				
		int finalCalculation = (int) Math.pow((expressionOne - expressionTwo) / 10, 3);
		
		System.out.println("Expression result = " + finalCalculation);
	}
}
