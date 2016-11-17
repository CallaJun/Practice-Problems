public class Problem7 {

	public static void main(String[] args) {
		System.out.println(noodleCounter("It is difficult to pick up a single noodle with chopsticks."));
		System.out.println(noodleCounter("Noodle. Noodle! NOODLE! Noodle is my dog."));
		System.out.println(noodleCounter("Noodles are great."));
	}
	
	public static int noodleCounter(String sentence) {
		int noodleCount = 0;
		String[] sentenceParts = sentence.split(" ");
		for (String word : sentenceParts) {
			if (processWord(word).equals("noodle")) {
				noodleCount++;
			}
		}
		return noodleCount;
	}
	
	// Make word lower case and remove characters that are not letters
	public static String processWord(String inputWord) {
		return inputWord.toLowerCase().replaceAll("[^a-zA-Z]", "");
	}
}