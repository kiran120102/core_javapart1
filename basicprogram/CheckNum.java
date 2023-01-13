package basicprogram;

import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = s.nextInt();
		
		if(num<0) {
			System.out.println("number is -ve");
		}
		else if(num>0) {
			System.out.println("number is +ve");
		}
		else {
			System.out.println("number is zero");	
		}

	}

}
