package basicprogram;

import java.util.Scanner;

public class SwitchCase {

	private static int ch;

	public static void main(String[] args) {
		
		
		int a,b;
		int ch;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Enter operation:\n 1.Addition\n 2.Subtraction\n 3.exit");
			ch = s.nextInt();
			
			System.out.println("Enter Two number : ");
			a = s.nextInt();
			b = s.nextInt();
			
			switch(ch) {
			case 1:
				System.out.format("%d + %d = %d \n", a, b, a+b);
				break;
			case 2:
				System.out.format("%d - %d = %d \n", a, b, a-b);
				break;
			case 3:
				System.exit(0);
			default:
				System.out.format("Invalid");
				break;
			
		}
		}while(ch != 4);
}
	
}
