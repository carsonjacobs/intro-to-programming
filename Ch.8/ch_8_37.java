/*
Author: Carson Jacobs
Date: 3/6/19
*/

import java.util.Scanner;

public class ch_8_37 {
	
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);

		//States and Capitals array
		String[][] guessCapitals = capitalAnswers();
		
		//Correct answer counter
		int counter = 0;						
		// Prompts user to enter capital for states
		for (int i = 0; i < guessCapitals.length; i++) {
			System.out.print("What is the capital of " + guesscCapitals[i][0] + "? ");
			String capital = input.nextLine();
			//displays if answer is corrent
			if (isEqual(guessCapitals[i][1], capital)) {
				System.out.println("Your answer is correct");
				counter++;
			}
			//displays if answer is wrong
			else {
				System.out.println("The correct answer should be " + guessCapitals[i][1]);
			}
		}

		// Displays total correct
		System.out.println("\nThe correct count is " + counter);
	}

	//determines if user answer matches actual answer
	public static boolean isEqual(String b, String a) {
		if (b.length() != a.length())
			return false;

		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) != a.charAt(i))
				return false;
		}

		return true;
	}

	//array with 10 states and their capitals
	public static String[][] capitalAnswers() {
		String[][] answers = {
			{"California", "Sacramento"}, 
			{"Tennessee", "Nashville"}, {"Oregon", "Salem"}, 
			{"Utah", "Salt Lake City"}, {"Florida", "Talahassee"}, 
			{"Louisiana", "New Orleans"}, {"Washington", "Olympia"}, 
			{"West Virginia", "Charleston"}, {"Georgia", "Atlanta"}, 
			{"Colorado", "Denver"}};
		return answers;
	}
}
