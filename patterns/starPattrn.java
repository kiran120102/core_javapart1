package patterns;

import java.util.Scanner;

public class starPattrn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of rows: " );
		int rows = s.nextInt();
		
		/*
		 * for(int i=0;i<=rows;i++) { //rows for(int j=1; j<=i; j++) { //columns
		 * System.out.print("* "); } System.out.println(); }
		 */
		
		for(int i=rows;i>=1;i--) { //rows
			for(int j=1; j<=i; j++) { //columns
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
