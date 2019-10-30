package academy.learnprogramming;

import java.util.Scanner;

//this is the main Class that holds everything

public class Main {

    public static void main(String[] args) {
	    var scanner = new Scanner(System.in);

	    // This line prints out the intro to the Doctor.java program

	    System.out.println(Doctor.intro());
	    var userInput = "";

	    while(!userInput.equalsIgnoreCase("quit")) {
			userInput = scanner.nextLine();
			String response = Doctor.response(userInput);
			System.out.println(response);
		}

	    scanner.close();
    }
}
