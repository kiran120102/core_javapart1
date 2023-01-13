package patterns;

import java.util.Scanner;

public class Numpattrn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of rows: " );
		int rows = s.nextInt();
		
		/*
		 * for(int i=0;i<=rows;i++) { //rows for(int j=1; j<=i; j++) { //columns
		 * System.out.print(i); } System.out.println(); }
		 */
		int k=1;
		for(int i=0;i<=rows;i++) { //rows
			for(int j=1; j<=i; j++) { //columns
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}

}
