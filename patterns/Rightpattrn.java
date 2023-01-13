package patterns;

import java.util.Scanner;

public class Rightpattrn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of rows: " );
		int rows = s.nextInt();
		
		for(int i=1;i<=rows;i++) { //rows
			
			for(int k=rows; k>=i; k--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) { //columns
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
