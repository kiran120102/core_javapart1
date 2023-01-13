package basicprogram;

import java.util.Scanner;

public class MaxNumUsingIfElse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 Numbers : ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("Greatest number is : " + n1);
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("Greatest number is : " + n2);
		}
		else {
			System.out.println("Greatest number is : " + n3);
		}

	}

}
