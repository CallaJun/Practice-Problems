import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PatronusSearch {
	// A static (unchanging) array of DirectoryEntry objects,
	// called directory
	public static DirectoryEntry[] directory;
	
	// The main function in this class
	public static void main(String[] args) {
		// Read data and populate directory
		readData();
		
		// Welcome message
		JOptionPane.showMessageDialog(null, "Welcome to Patronus search! Enter one of "
						+ "the following patronuses, and find information about \n"
						+ "the wizard or witch to whom it belongs.");
		String[] options = {"Yes", "No"};
		int response = 0;
		do {
			//Taking in the patronus
			String userInput = JOptionPane.showInputDialog("Enter a patronus: ");
			
			// Perform search
			int patronusIndex = search(directory, userInput);
			
			if(patronusIndex>0){
				String userRequestedInfo = directory[patronusIndex].getName() 
						+ "\t" + directory[patronusIndex].getHouse();
				JOptionPane.showMessageDialog(null, userRequestedInfo);
			} else {
				JOptionPane.showMessageDialog(null, "The patronus " + userInput + " does not exist in the directory.");
			}
			
			response = JOptionPane.showOptionDialog(null, "Do you want me to search again?", 
					"Results...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
					null, options, options[0]);
			
		} while (response == 0);
		
	}
	public static int search(DirectoryEntry[] dir, String patronus){
		for (int i = 0; i< dir.length; i++){
			if (dir[i].equals(patronus) == true){
		        return i;
		    }
		}
		return -1;
	}
	/*
	 * Reads and parses data from data.txt, and places reach parsed
	 * entry into directory by creating DirectoryEntry objects
	 */
	public static void readData() {
		try {
			// Open an input stream to the data file
			Scanner data = new Scanner(new File("data/data.txt"));
			
			// Storing the number of data entries
			String line = data.nextLine();
			int numLines = Integer.parseInt(line);
			
			// Set the directory size based on the first line
			directory = new DirectoryEntry[numLines];
			
			// Iterate through each line of the data
			for (int i = 0; i < numLines; i++) {
				line = data.nextLine();
				
				String[] pieces = new String[3];
				pieces = line.split("\\t", -1);
				// Split the first and the last name
				String[] firstAndLast = new String[2];
				firstAndLast = pieces[0].split(" ");
				String first = firstAndLast[0];
				String last = firstAndLast[1];
				// Set patronus to the second piece of data
				String patronus = pieces[1];
				// Set hogwartsHouse to the third piece of data
				String hogwartsHouse = pieces[2];
				
				// Create a DirectoryEntry with the data you have gathered
				DirectoryEntry entry = new DirectoryEntry(first, last, 
						patronus, hogwartsHouse);
				
				// Add the entry to the directory
				directory[i] = entry;
			} // End for loop
		} catch (FileNotFoundException e) {
			System.out.println("Error in opening the file");
		}
	}
}

public class DirectoryEntry {
	// Member variables
	private String firstName, lastName, patronus, house;
	
	// Constructor
	public DirectoryEntry(String firstName, String lastName, 
			String patronus, String hogwartsHouse) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.patronus = patronus;
		this.house = hogwartsHouse;
	}
	
	// Getters
	public String getPatronus() {
		return patronus;
	}
	
	public String getHouse() {
		return house;
	}
	
	public String getName() {
		return lastName + ", " + firstName + "\t" + house;
	}
	
	public boolean equals(String userPatronus){
		String formattedPatronus = patronus.toLowerCase().trim();
		String formattedUserPatronus = userPatronus.toLowerCase().trim();
		if(formattedPatronus.equals(formattedUserPatronus)){
			return true;
		}
		return false;
	}
}
