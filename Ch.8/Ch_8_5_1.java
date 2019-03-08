import java.util.Scanner;

/*
Author: Carson Jacobs
Date: 2/22/19

Programs sums two 3x3 matricies
*/
class Ch_8_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double oj[][] = new double[3][3]; //Matx 1
		double aj[][] = new double[3][3]; //Matx 2
		double[][] oreos = new double[3][3]; //Matx 3
		
		// Prompt user for Marix A
		for (int row = 0; row < 3; row++) {
		System.out.print("Enter 3 numbers for row" + (row + 1) + "for Matrix A: ");
		for (int col = 0; col <= 2; col++) {
			oj[row][col] = input.nextDouble();
		
		}
	}
	
	// Prompt user for Marix B
	for (int row = 0; row < 3; row++) {
		System.out.print("Enter 3 numbers for row" + (row + 1) + "for Matrix B: ");
		for (int col = 0; col <= 2; col++) {
			aj[row][col] = input.nextDouble();
			}
		}	
	
		oreos = addMatrix(oj, aj);
		
		// Counts rows
		// Print before the table
		for (int row = 0; row <=2; row++) {
			// Counts colomns
			// Print first item in row
			for (int col = 0; col < 3; col++) {
				// Print for every table element
				System.out.print(oreos[row][col] + " ");
			}
			// Print last item on row
			System.out.println();
		}
		// Print after table
	}
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c = new double[3][3];
		
		for (int row = 0; row < c.length; row++){
			for ( int col = 0; col < c[0].length; col++){
				c[row][col] = a[row][col] + b[row][col];
			}
		}
		
		return c;
		
		
	}
}