/*
Author: Carson Jacobs
11/13/18
*/

public class Ex_5_11 {

	public static void main(String[] args) {

		int count = 1;
		for (int i = 100; i <= 200; i++) {

			if (i % 6 == 0 ^ i % 5 == 0) {
				System.out.print((count++ % 10 != 0) ? i + " " : i + "\n");

			}

		}
	}
}