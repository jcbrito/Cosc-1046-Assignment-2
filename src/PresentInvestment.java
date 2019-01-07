import java.util.Scanner;
public class PresentInvestment {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the future value of the investment: ");
		double futureValue = in.nextDouble();
			
		System.out.print("Please enter the amount of years to the future value: ");
		double years = in.nextDouble();
		
		System.out.print("Please enter the annual interest rate (%): ");
		double interestRate = in.nextDouble();
		double monthlyInterest = interestRate / 1200;
		
		double presentValue = futureValue / Math.pow(1 + monthlyInterest, 12 * years);
		
		System.out.println("The present value of this investment is $" + (int)(presentValue * 100 + 0.5) / 100.0 );
		
		
	}
}
