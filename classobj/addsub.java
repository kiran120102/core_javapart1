package classobj;

public class addsub {
	
	int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	int add(int a) {
		return a++;
	}
	
	int add(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}
	
	float add(int a, float b) {
		float sum = a + b;
		return sum;
	}
	
	float add(float a, int b) {
		float sum = a + b;
		return sum;
	}
	
	void sub(int c, int d) {
		System.out.println("sub : " + (c-d));
	}

	public static void main(String[] args) {
		addsub as = new addsub();
		System.out.println(as.add(2, 6));
		as.sub(5, 2);
		System.out.println("one parameter : " + as.add(6));
		System.out.println("three parameter : " + as.add(2, 3, 4));
		
		System.out.println("one parameter : " + as.add(1, 2.3f));
		System.out.println("one parameter : " + as.add(2.3f,1));
		
	}

}
