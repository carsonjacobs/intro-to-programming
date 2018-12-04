/*
Author: Carson Jacobs
Date: 12/1/2018
*/
import java.util.Scanner;
class Untitled {
	public static void main(String[] args) {
		int num = 100;
		int count = 0;
		while(num <= 200) {
			if ((num % 5 == 0) ^ (num % 6 == 0)) {
				System.out.print(num + " ");
				num++;
			}
			if ((num == 10)) {
				System.out.println(" ");
				count = 0;
			}
			num++;
		}
	}
}