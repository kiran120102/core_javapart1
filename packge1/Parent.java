package packge1;

class Parent {
	
	void display() {
		System.out.println("Parent class");
	}
}

class Child1 extends Parent{
	void display1() {
		System.out.println("Child 1 class");
	}
}
class Child2 extends Child1{
	void display2() {
		System.out.println("Child 2 class");
	}
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.display();
		c.display1();
		c.display2();
	
	}
}