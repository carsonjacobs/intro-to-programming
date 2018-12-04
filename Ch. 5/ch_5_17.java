/*
Author: Carson Jacobs
Date: 12/1/2018
*/
import java.util.Scanner;
class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
		System.out.print("Enter an integer from 1 to 15");
		user = input.nextInt();
		
		while (user > 15 || user < 1) {
			System.out.print("Enter height of pyramid (1 - 15): ");
			user = input.nextInt();
		}
	
		for (int count = 1; count <= user; count++) {
			
			for (int space = 1; space <= (user - count); space++) {
				System.out.print("   ");
			}
			
			
			for (int left = count; left >= 1; left--) {
				System.out.printf("%3d", left);
			}
			
			for (int right = 2; right <= count; right++) {
				System.out.printf("%3d", right);
			}
			
			System.out.println();
		}
	}
}