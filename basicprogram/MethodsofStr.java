package basicprogram;

import java.util.Arrays;

public class MethodsofStr {

	public static void main(String[] args) {
		
		String s1="Kiran";
		String s2="Shinde";
		String s4="  kiran "; 
		System.out.println("Full name : " + s1 + s2);
		System.out.println("Full name : " + s1.concat(s2));
		System.out.println("Length : " + s1.length());
		System.out.println("Full name : " + s2.substring(2,4));
		System.out.println("Uppercase : " + s1.toUpperCase());

		String s3="";
		System.out.println("To Check a Null : " + s1.isEmpty());

		char[] arr = new char[6];
		s2.getChars(0, 6, arr, 0);
		System.out.println("GetChars : " + Arrays.toString(arr));
		System.out.println("Comparison : " + s1.compareTo(s4));
		System.out.println("Equals : " + s1.equals(s4));
		System.out.println("Equals : " + s1.equalsIgnoreCase(s4));
		System.out.println("Start With : " + s1.startsWith("Ki"));
		System.out.println("End With : " + s1.endsWith("n"));
		System.out.println("Replace : " + s1.replace("Kiran","Chetana"));
		System.out.println("Repeat : " + s1.repeat(3));
		System.out.println("Char at : " + s2.charAt(0));
		System.out.println("Trim Lead : " + s4.stripLeading());
		System.out.println("Trim Trail : " + s4.stripTrailing());
		
		
		
		
		
		
		
	}

}
