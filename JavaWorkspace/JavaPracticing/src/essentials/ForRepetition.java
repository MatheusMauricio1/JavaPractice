package essentials;

public class ForRepetition {
	public static void main(String[] args) {
		
		int b = 0;
		
		for(int a = 0; a < 10; a++) {
			System.out.println("Hello World!");
			b += 5;
			System.out.printf("b value: %s\n", b );
		}
		int x =0;
		
		for(;x < 10;) {
			x += 2;
			System.out.println(x);
		}
		
		for(;;) {
			System.out.println("'Lol, lmao'. Said the scorpion.");
		}
	}
}
