package basicprogram;

import java.util.Scanner;

public class ArithmeticOp {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Value of a and b : " );
	int a = s.nextInt();
	int b = s.nextInt();
	
	System.out.println("Enter Your percentage : " );
	float per = s.nextFloat();
	
	System.out.println("Enter Your Name : " );
	String name = s.next();
	char ch = name.charAt(0);
	
	System.out.println("Sum : " + (a+b));
	System.out.println("Percentage : " + per);
	System.out.println("Name : " + name);
	System.out.println("First character : " + ch);
	
	}

}
