/*
Author: Carson Jacobs
Date: 12/1/2018
*/
import java.util.Scanner;
class Untitled {
	public static void main(String[] args) {
		int negCount = 0;
		int posCount = 0;
		int num = 0;
		int sum = 0;
		System.out.print("Enter a positive or negative number: ");
	    num = input.nextInt();
		

		while(num != 0){
				
			if(num <= -1){
				negCount++;
			}
			else {
				posCount++;
			}
		}
			System.out.print("Enter a positive or negative number (0 to quit): ");
			num = input.nextInt();
		System.out.print("Positive numbers: " + posCount);
		System.out.print("Negative numbers: " + negCount);
		sum = posCount + negCount;
		System.out.print("Total" + sum);
	}
}