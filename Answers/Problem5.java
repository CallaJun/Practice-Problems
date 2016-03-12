public class Problem5 {

	public static void main(String[] args) {
		greet("Calla");
		
		String yourName = "Angelina";
		greet(yourName);
	}
	
	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}

}
