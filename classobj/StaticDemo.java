package classobj;

class StaticDemo1 {
	static int a,b;
	static String name;
	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
	
	}
}
public class StaticDemo{
	public static void main(String[] args) {
		StaticDemo1.a=10;
		StaticDemo1.b=12;
		StaticDemo1.name="abc";
		StaticDemo1.display();

	}
}
