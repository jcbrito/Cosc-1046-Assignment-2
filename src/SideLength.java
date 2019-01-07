import java.util.Scanner;

public class SideLength {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the x cordinates for the first point of the triagle : ");
		double x1 = in.nextDouble();
		
		System.out.print("Please enter the y cordinates for the first point of the triagle : ");
		double y1 = in.nextDouble();
		
		System.out.print("Please enter the x cordinates for the second point of the triagle : ");
		double x2 = in.nextDouble();
		
		System.out.print("Please enter the y cordinates for the second point of the triagle : ");
		double y2 = in.nextDouble();
		
		System.out.print("Please enter the x cordinates for the third point of the triagle : ");
		double x3 = in.nextDouble();
		
		System.out.print("Please enter the y cordinates for the third point of the triagle : ");
		double y3 = in.nextDouble();
		
		double sideOneLength = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		
		double sideTwoLength = Math.sqrt((Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)));
		
		double sideThreeLength = Math.sqrt((Math.pow(x1 - x3, 2) + Math.pow(y3 - y1, 2)));
		double perimeterOfTriangle = sideOneLength + sideTwoLength  + sideThreeLength;
		
		//
		double semiPerimeter = perimeterOfTriangle /2;
		
		//Calculate area
		double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideOneLength) * (semiPerimeter - sideTwoLength) * (semiPerimeter - sideThreeLength));
		
		
		//System.out.println(sideOneLength+ " \t " + sideTwoLength + " \t" + sideThreeLength );
		
		System.out.println("The area of the triangle is: "+  (int)(area * 10 + 0.5) / 10.0 );
		
		System.out.println("The perimeter of the triangle is: "+  (int)(perimeterOfTriangle * 10 + 0.5) / 10.0 ) ;
		
		
		
		
		

		
	}
	
}
