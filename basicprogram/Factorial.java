package basicprogram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = s.nextInt();
		int fact = 1;
		for(int i =1; i<=num ; i++) {
			fact = fact * i;
	
		}
		System.out.println("Factorial of number : " + fact);
		
	}
	
}


