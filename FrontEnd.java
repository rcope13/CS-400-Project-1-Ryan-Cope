import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class FrontEnd {

	public static void main(String[] args) {
		boolean quit = false;
		String command = null;
		Scanner scnr = new Scanner(System.in);
		String prompt = "What would you like to do? To see the commands, type c.";
		HashTableMap<String,CourseReading> genericHashTable;
		
		//this is where you decide to create a new database or use the default
		System.out.println("Now running Check Your Texts. Would you like create a new database or import the default database?"
				+ " To create a new database, input n, and to use the default database, input d.");
		command = scnr.nextLine().toLowerCase().trim();
		boolean pickedDatabase = false;
		while(pickedDatabase == false) {
			if((!command.equals("n")) && (!command.equals("d"))) {
				System.out.println("Please input a valid command.");
				command = scnr.nextLine().toLowerCase().trim();
			}
			if(command.equals("d")) {
				genericHashTable = Wrangle.readCSV("src/textbook_file.csv");
				if(genericHashTable != null) {
					pickedDatabase = true;
				}
				System.out.println("Something went wrong. Try another command.");
				command = scnr.nextLine().toLowerCase().trim();
			}
			if(command.equals("n")) {
				genericHashTable = new HashTableMap<String, CourseReading>();
				pickedDatabase = true;
			}
		}
		
		System.out.println("Your database has been initialized. What would you like to do now? For a list of commands, input c.");
		command = scnr.nextLine().toLowerCase().trim();

		while (quit == false) {
			// check for valid command
			if ((!command.equals("c")) && (!command.equals("g")) && (!command.equals("p")) && (!command.equals("r")) && (!command.equals("q"))) {
				System.out.println("Must use valid command. " + prompt);
				command = scnr.nextLine().toLowerCase().trim();
			}

			// outputs information corresponding to the "c" command
			if (command.equals("c")) {
				System.out.println("List of Commands:");
				System.out.println("g = get list of courses from ISBN");
				System.out.println("p = put or add a course to the specified ISBN ");
				System.out.println("r = check through a list of courses until the course to remove has been found");
				System.out.println("q = quit");
				System.out.println(prompt);
				command = scnr.nextLine().toLowerCase().trim();
			}

			// outputs information corresponding to the "g" command
			if (command.equals("g")) {
				System.out.println("You have chosen to get a course from an ISBN. Please input a valid ISBN.");
				String inputISBN = scnr.nextLine().trim();
				//run the getHashIndex(inputISBN) command
			}

			// outputs information corresponding to the "p" command
			if (command.equals("p")) {
				System.out.println("You have chosen to put a course into the database. Please input a valid ISBN.");
				String inputISBN = scnr.nextLine().trim();
				System.out.println("Please input a valid book title.");
				String inputTitle = scnr.nextLine().trim();
				System.out.println("Please input a valid course name.");
				String inputCourseName = scnr.nextLine().trim();
				//run the insert(inputISBN, inputTitle, inputCourseName) command
			}

			// outputs information corresponding to the "r" command
			if (command.equals("r")) {
				System.out.println("You have chosen to remove a course. Please input a valid ISBN to check for the course.");
				String inputISBN = scnr.nextLine().trim();
				//run the remove(inputISBN) command
			}
			// outputs information corresponding to the "q" command
			if (command.equals("q")) {
				System.out.println("Quitting the program.");
				quit = true;
			}
		}

	}

}
