package classExercises;

public class Class_Product_Test {
	public static void main(String[] args) {
		/*
		 * This is where i'm going to test the linking between classes.
		 * 
		 * */
		Class_Product p1 = new Class_Product("Lenovo Ideapad", 30.0);
		p1.price = 1.500;
				
		System.out.printf("Final Price: R$ %.3f ", p1.discountedPrice());
	}
}
