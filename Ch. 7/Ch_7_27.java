/*
 Author: Carson Jacobs
 Date: 2/20/2019
 Locker Puzzle
 */



import java.util.Scanner;
public class Ch_7_27 {

	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		
		for (int student = 1; student <= 100; student++) {
			for(int a = (student-1); a < 100; a += student) {
				lockers[a] = !lockers[a];
			
			}
		}
	
			if(lockers[i] == true) {
				System.out.printf("L%d ", i + 1);
			
			}
		}
	}
}