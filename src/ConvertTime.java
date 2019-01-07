import java.util.Scanner;

public class ConvertTime {
	
	public static void main(String[] argd) {

		final int SECONDS_IN_YEAR 	= 31536000;
		final int SECONDS_IN_DAY 	= 86400;
		final int SECONDS_IN_HOUR 	= 3600;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a value in Seconds to be converted: ");
		long seconds = in.nextLong();
		
		
		long years = seconds / SECONDS_IN_YEAR;
		long remainingSeconds =  seconds % SECONDS_IN_YEAR;
		
		long days = remainingSeconds / SECONDS_IN_DAY;
		remainingSeconds = remainingSeconds % SECONDS_IN_DAY; 
		
		long hours = remainingSeconds / SECONDS_IN_HOUR;
		remainingSeconds = remainingSeconds % SECONDS_IN_HOUR;
		
		long minutes = remainingSeconds / 60;
		remainingSeconds = remainingSeconds % 60;
		
		System.out.println(seconds + " seconds is approximately " + years +" years, " + days +" days, " + hours + " hours, " + minutes + " minutes, and " + remainingSeconds + " seconds" );
		
		
		
	}

}
