
public class Problem2 {
	/*
	 * In this program, I have supplied many solutions to the same
	 * problem. Each of these methods - add1, add2, add3, etc. - produce
	 * the same result. Your code will hopefully be a lot shorter than mine -
	 * I just created many more solutions for you.
	 */
	public static void main(String[] args) {
		/*
		 * This prints out the return value of the add methods
		 * when 5 is passed in as a, and 6 is passed in as b.
		 */
		System.out.println(add1(5, 6));
		System.out.println(add2(5, 6));
		System.out.println(add3(5, 6));
		
		/*
		 * Another way to call these functions, declaring integers
		 * first, and then passing them into the methods
		 */
		int firstParameter = 56;
		int secondParameter = 23;
		System.out.println(add1(firstParameter, secondParameter));
		System.out.println(add2(firstParameter, secondParameter));
		System.out.println(add3(firstParameter, secondParameter));
		
		/*
		 * A mix of both
		 */
		System.out.println(add1(firstParameter, 90));
		System.out.println(add2(76, secondParameter));
		System.out.println(add3(firstParameter, 45));
	}
	
	// The cleanest and simplest solution
	public static int add1(int a, int b) {
		// Returns the sum of a and b
		return a + b;
	}
	
	// Another great solution
	public static int add2(int a, int b) {
		// Sets the integer sum to the sum of a and b, and returns sum
		int sum = a + b;
		return sum;
	}
	
	// A needlessly tedious solution that works nevertheless
	public static int add3(int a, int b) {
		// Sets the integer sum to a
		int sum = a;
		// Adds b to sum
		sum = sum + b;
		// Returns sum
		return sum;
	}
}
