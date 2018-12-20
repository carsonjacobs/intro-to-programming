/*
 Author: Carson Jacobs
 Date: 12/13/2018
 */
import java.util.Scanner;
public class Ex_6_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
			int n = input.nextInt();
			printMatrix(n);
			
	}
	public static void printMatrix(int n) {
		for(int x = 0; x < n; x++) {
			for(int y = x; y < n; y++) {
				System.out.print((int) (Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}

}
