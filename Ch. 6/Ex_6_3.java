/*
 Author: Carson Jacobs
 Date: 12/8/2018
 */

import java.util.Scanner;

class Ex_6_3 {
	public static int reverse(int number) {
		
		
		int remain = 0;
		int reverse = 0;
	

			while (number != 0) {
				remain = number % 10;
				reverse = reverse * 10 + remain;
				number = number/=10;
			}
			return reverse;
	}
	public static boolean isPalindrome(int number) {
		boolean isPalindrome = false;
			//call reverse method and check if palindrome
			int reverse = reverse (number);
			if (reverse == number) {
				isPalindrome = true;
			}
		
	
			return isPalindrome;
	}
		public static void main(String [] args) {
			// Declare variables
			Scanner input = new Scanner(System.in);
			int user = 0;
			
			//prompt user
			System.out.print(" Enter a number ");
			user = input.nextInt();
			System.out.println("Is " + user + " a palindrome? " + isPalindrome(user));
		
	}
}