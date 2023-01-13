package basicprogram;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num1 = s.nextInt();
		int num = num1;
		int rev = 0;
		while(num>0) {
			int rem = num%10;
			rev = rev * 10 + rem;
			num=num/10;
		}
		if(rev == num1) {
			System.out.println("number is Palindrome");
		}
		else {
			System.out.println("number is not Palindrome");
		}
	}

}
