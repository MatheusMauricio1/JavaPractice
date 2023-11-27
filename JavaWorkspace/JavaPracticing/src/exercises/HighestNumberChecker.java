package exercises;

import java.util.Scanner;

public class HighestNumberChecker {
	public static void main(String[] args) {
		/* 
		 * Create a program that receives 10 values, and shows in the console the highest of them.
		 * */
		Scanner sc = new Scanner(System.in);

		double A = 0;
		double B = 0;
		double C = 0;
		double D = 0;
		double E = 0;
		double F = 0;
		double G = 0;
		double H = 0;
		double I = 0;
		double J = 0;
		
		for(int a =0; a <= 10; a++) {
			if(a == 1) {
				System.out.print("Please type the first number: ");
				A += sc.nextDouble();
			}
			else if(a == 2) {
				System.out.print("Please type the second number: ");
				B += sc.nextDouble();
			}
			else if(a == 3) {
				System.out.print("Please type the third number: ");
				C += sc.nextDouble();
			}
			else if(a == 4) {
				System.out.printf("Please type the %dth number: ", a);
				D += sc.nextDouble();
			}
			else if(a == 5) {
				System.out.printf("Please type the %dth number: ", a);
				E += sc.nextDouble();
			}
			else if(a == 6) {
				System.out.printf("Please type the %dth number: ", a);
				F += sc.nextDouble();
			}
			else if(a == 7) {
				System.out.printf("Please type the %dth number: ", a);
				G += sc.nextDouble();
			}
			else if(a == 8) {
				System.out.printf("Please type the %dth number: ", a);
				H += sc.nextDouble();
			}
			else if(a == 9) {
				System.out.printf("Please type the %dth number: ", a);
				I += sc.nextDouble();
			}
			else if(a == 10) {
				System.out.printf("Please type the %dth number: ", a);
				J += sc.nextDouble();
			}
		}
		if(A > B && A > C && A > D && A > E && A > F && A > G && A > H && A > I && A > J) {
			System.out.println("The Highest Number is: " + (int) A);
		}
		else if(B > A && B > C && B > D && B > E && B > F && B > G && B > H && B > I && B > J) {
			System.out.println("The Highest Number is: " + (int) B);
		}
		else if(C > B && C > A && C > D && C > E && C > F && C > G && C > H && C > I && C > J) {
			System.out.println("The Highest Number is: " + (int) C);
		}
		else if(D > B && D > C && D > A && D > E && D > F && D > G && D > H && D > I && D > J) {
			System.out.println("The Highest Number is: " + (int) D);
		}
		else if(E > B && E > C && E > D && E > A && E > F && E > G && E > H && E > I && E > J) {
			System.out.println("The Highest Number is: " + (int) E);
		}
		else if(F > B && F > C && F > D && F > E && F > A && F > G && F > H && F > I && F > J) {
			System.out.println("The Highest Number is: " + (int) F);
		}
		else if(G > B && G > C && G > D && G > E && G > F && G > A && G > H && G > I && G > J) {
			System.out.println("The Highest Number is: " + (int) G);
		}
		else if(H > B && H > C && H > D && H > E && H > F && H > G && H > A && H > I && H > J) {
			System.out.println("The Highest Number is: " + (int) H);
		}
		else if(I > B && I > C && I > D && I > E && I > F && I > G && I > H && I > A && I > J) {
			System.out.println("The Highest Number is: " + (int) I);
		}
		else {
			System.out.println("The Highest Number is: "+ (int) J);
		}
		
		sc.close();
	}
}
