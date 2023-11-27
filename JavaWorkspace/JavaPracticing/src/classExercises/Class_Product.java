package classExercises;

public class Class_Product {
		/*
		 * I will use this code in order to learn how classes and objects works together in JAVA.
		 * But it's nothing more than a simple exercise or foundations of OOP.
		 * */
		String name;
		double price;
		static double discount = 25.0;
		
		Class_Product(String initialName){
			name = initialName;
		}
		Class_Product(String initialName, double newDiscount){
			name = initialName;
			discount = newDiscount;
		}
		
		Class_Product(){
		}
		
		double discountedPrice() {
			double finalPrice = price - ((discount * price) / 100);
			return finalPrice;
		}
		double discountedPrice(double managerDiscount) {
			double finalPrice = price - ((managerDiscount * price) / 100);
			return finalPrice;
		}
		
}
