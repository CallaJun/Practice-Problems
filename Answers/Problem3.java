public class Problem3 {
	public static void main(String[] args) {
		// Setting an integer to 0
		int i = 0;
		// While i is less than 40, the while loop runs
		while (i < 40) {
			// If i is less than or equal to 15, increment i by 5
			if (i <= 15) {
				i += 5;
			} else { // Otherwise, increment i by 6 instead
				i += 6;
			}
			// Print out i
			System.out.println(i);
		}
	}
}
