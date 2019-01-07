import java.util.Scanner;
public class SphereAreaAndVolume {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the volume of the sphere: ");
		double radius = in.nextDouble();
		
		double area = 4 * Math.PI * (Math.pow(radius, 2));
		
		double volume = (4.0/3.0) * (Math.PI *(Math.pow(radius, 3))); 
		
		System.out.println("The surface area of the sphere is " + area);
		System.out.println("The volume of the sphere is " + volume);
	}
}
