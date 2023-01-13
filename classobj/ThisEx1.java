package classobj;

public class ThisEx1 {

	int a, b;
	
	ThisEx1(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	ThisEx1(int a){
		this(a,a);
	}
	
	ThisEx1(){
		this(0);
	}
	
	@Override
	public String toString() {
		return "ThisEx1 [a=" + a + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		ThisEx1 t = new ThisEx1();
		ThisEx1 t1 = new ThisEx1(6);
		ThisEx1 t2 = new ThisEx1(5, 4);		
		System.out.println("t : " + t);
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
	}
}
