import java.util.Scanner;

public class PolynomialEquation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter coefficient a: ");
	    double a = scan.nextDouble();
	    System.out.print("Enter coefficient b: ");
	    double b = scan.nextDouble();
	    System.out.print("Enter coefficient c: ");
	    double c = scan.nextDouble();
	    
	    double discriminant = b * b - 4 * a * c;
	    
	    if (discriminant > 0) {
	    	double root1 = (-b + Math.sqrt(discriminant))/(2*a);
	    	double root2 = (-b - Math.sqrt(discriminant))/(2*a);
	    	System.out.println("The roots are real and distinct");
	    	System.out.println("Root1 = "+ root1);
	    	System.out.println("Root2 = "+ root2);
	    }else if (discriminant == 0) {
	    	double root = -b / (2 * a);
	    	System.out.println("The roots are real and equal");
	    	System.out.println("Root = "+ root);
	    }else {
	    	double realPart = -b /(2*a);
	    	double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
	        System.out.println("The roots are complex and imaginary:");
	        System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
	        System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
	    }
	    scan.close();

	}

}
