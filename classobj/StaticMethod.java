package classobj;

class Hello{
	static int add(int a, int b) {
		return a+b;
	}
	
	int mul(int a, int b) {
		return a*b;
	}
	
	float div(float f, float g) {
		return f/g;
	}
	
	String greet(String a) {
		return "hello" + a;
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println("mul : " + h.mul(2,3));
		String s = h.greet("Chetana");
		System.out.println(s);
		System.out.println("Division : " + h.div(2.1f, 4.2f));
		int add = Hello.add(4, 2);
		System.out.println("Sum : " + add);
	}

}
