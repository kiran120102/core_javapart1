package packge1;

import java.util.Scanner;

class Input {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
}

class Add extends Input{
	void display() {
		System.out.println("Addition : "+(a+b));
	}
}
class Sub extends Add{
	void display1() {
		System.out.println("Subtration : "+(a-b));
	}
}

class Mult extends Sub{
	void display2() {
		System.out.println("Multiplication : "+(a*b));
	}
}
class Div extends Mult{
	void display3() {
		System.out.println("Division : "+(a/b));
	}
}

class operation{
	public static void main(String[] args) {
		Div a =new Div();
		a.display();
		a.display1();
		a.display2();
		a.display3();
	}
}