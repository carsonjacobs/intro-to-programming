/*
Author: Carson Jacobs
Date: 12/20/18
*/

import java.util.Scanner;
class Ex_6_37_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int integer = input.nextInt();
		System.out.print("Enter the width: ");
		int width = input.nextInt();
		
		System.out.println("The formated string is: " + format(integer, width));
	}
	public static String format(int integer, int width){
		String num = integer + "";
		
		if (num.length() < width){
			for (int i = width - num.length(); i > 0; i--){
				num = 0 + num;
			}
		}
		return num;
	}
}