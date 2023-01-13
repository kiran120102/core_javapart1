package packge1;

import java.util.Scanner;

class Addition {
	
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	
	void add(){
		System.out.println("Addition : "+(a+b));
	}
}
class Subtract extends Addition {
	void sub(){
		System.out.println("Addition : "+(a-b));
	}
	public static void main(String[] args) {
		System.out.println("Enter value of a and b");
		Subtract s1 = new Subtract();
		s1.add();
		s1.sub();

	}
	
}