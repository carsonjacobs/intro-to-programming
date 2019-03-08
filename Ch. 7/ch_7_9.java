/*
Author: Carson Jacobs
Dae: 2/7/19

Find the minimum element of an array
*/
import java.util.Scanner;

class ch_7_9 {
	public static void main(String[] args) {
		
		// Declare Scanner and array
		Scanner input = new Scanner(System.in);
		double[] cookie = new double[10];
		
		// Populate array elements
		System.out.print("Enter 10 double values: ");
		for (int index = 0; index < 10; index++) {
			cookie[index] = input.nextDouble();
		}
		
		// Call the min method and display
		System.out.println("The minimum element is " + min(cookie));
	}
	
	public static double min(double[] array) {
		double min = array[0];
		
		// Search through array
		for (int i = 1; i < 10; i++) {
			if (array [i] < min) {
				min = array[i];
			}
		}
		
		// Return min
		return min;
	}
}