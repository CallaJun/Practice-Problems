
public class Problem4 {
	/*
	 * In this program, I have supplied many solutions to the same
	 * problem. Each of these methods produce
	 * the same result. 
	 */
	public static void main(String[] args) {
		/*
		 * This prints out the return value of the multiply methods
		 * when 5 is passed in as a, and 6 is passed in as b.
		 */
		System.out.println(multiply1(5, 6));
		System.out.println(multiply2(5, 6));
		System.out.println(multiply3(5, 6));
		
		/*
		 * Another way to call these functions, declaring integers
		 * first, and then passing them into the methods
		 */
		int firstParameter = 56;
		int secondParameter = 23;
		System.out.println(multiply1(firstParameter, secondParameter));
		System.out.println(multiply2(firstParameter, secondParameter));
		System.out.println(multiply3(firstParameter, secondParameter));
		
		/*
		 * A mix of both
		 */
		System.out.println(multiply1(firstParameter, 90));
		System.out.println(multiply2(76, secondParameter));
		System.out.println(multiply3(firstParameter, 45));
	}
	
	// The cleanest and simplest solution
	public static int multiply1(int a, int b) {
		// Returns the product of a and b
		return a * b;
	}
	
	// Another great solution
	public static int multiply2(int a, int b) {
		// Sets the integer product to the sum of a and b, and returns 
		// the product
		int product = a * b;
		return product;
	}
	
	// A needlessly tedious solution that works nevertheless
	public static int multiply3(int a, int b) {
		// Sets the integer product to a
		int product = a;
		// Adds b to product
		product = product * b;
		// Returns product
		return product;
	}
}
