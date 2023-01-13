package basicprogram;

import java.util.Scanner;

public class ReversedStr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = s.next();
		String nstr = "";
		char ch;
		
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch+nstr;
		}
		System.out.println("Reversed String : " + nstr);
		
		System.out.println("*******");
		StringBuilder s1 = new StringBuilder(str);
		StringBuilder rev1 = s1.reverse();
		System.out.println("Reverse : " + rev1);
	}

}
