import java.util.Scanner;

public class FrontEnd {

	public static void main(String[] args) {
		boolean quit = false;
		String command = null;
		Scanner scnr = new Scanner(System.in);
		String prompt = "What would you like to do? To see the commands, type c.";

		//setup of program
		
		//this is where the program should create the instance of hashtable from the csv
		HashTableMap<Integer, String> genericHashTable = new HashTableMap<Integer, String>();
		System.out.println("Now running Check Your Texts. " + prompt);
		command = scnr.nextLine().toLowerCase().trim();

		while (!quit) {
			// check for valid command
			if ((command != "c") || (command != "g") || (command != "p") || (command != "r") || (command != "q")) {
				System.out.println("Must use valid command. " + prompt);
				command = scnr.nextLine().toLowerCase().trim();
			}

			// outputs information corresponding to the "c" command
			if (command == "c") {
				System.out.println("List of Commands:");
				System.out.println("g = get list of courses from ISBN");
				System.out.println("p = put or add a course to the specified ISBN ");
				System.out.println("r = check through a list of courses until the course to remove has been found");
				System.out.println("q = quit");
				System.out.println(prompt);
				command = scnr.nextLine().toLowerCase().trim();
			}

			// outputs information corresponding to the "g" command
			if (command == "g") {
				System.out.println("You have chosen to get a course from an ISBN. Please input a valid ISBN.");
				Integer inputISBN = scnr.nextInt();
				//run the getHashIndex(inputISBN) command
			}

			// outputs information corresponding to the "p" command
			if (command == "p") {
				System.out.println("You have chosen to put a course into the database. Please input a valid ISBN.");
				Integer inputISBN = scnr.nextInt();
				System.out.println("Please input a valid book title.");
				String inputTitle = scnr.nextLine().trim();
				System.out.println("Please input a valid course name.");
				String inputCourseName = scnr.nextLine().trim();
				//run the insert(inputISBN, inputTitle, inputCourseName) command
			}

			// outputs information corresponding to the "r" command
			if (command == "r") {
				System.out.println("You have chosen to remove a course. Please input a valid ISBN to check for the course.");
				Integer inputISBN = scnr.nextInt();
				//run the remove(inputISBN) command
			}
			// outputs information corresponding to the "q" command
			if (command == "q") {
				System.out.println("Quitting the program.");
				quit = true;
			}
		}

	}

}
