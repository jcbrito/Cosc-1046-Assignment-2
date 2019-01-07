import java.util.Scanner;

public class LinearSystem {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		//print statements that ask for each value
		System.out.print("Please enter the value of a: ");
		double a = in.nextDouble();
		System.out.print("");
		
		System.out.print("Please enter the value of b: ");
		double b = in.nextDouble();
		System.out.print("");
		
		System.out.print("Please enter the value of c: ");
		double c = in.nextDouble();
		System.out.print("");
		
		System.out.print("Please enter the value of d: ");
		double d = in.nextDouble();
		System.out.print("");
		
		System.out.print("Please enter the value of e: ");
		double e = in.nextDouble();
		System.out.print("");
		
		System.out.print("Please enter the value of f: ");
		double f = in.nextDouble();
		System.out.print("");
		
		double valueOfX = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double valueOfY = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
		//print the linear functions
		System.out.println("\nThe first linear function is : " +  a + "x + " + b + "y = " + e  ); 
		System.out.println("The second linear function is : " +  c + "x + " + d + "y = " + f  );
		
		//print the results of X and Y
		System.out.println("\nThe value of X is " + valueOfX );
		System.out.println("The value of Y is " + valueOfY );
		
		
		
		
		
	}

}
