package classobj;

public class ThisEx2 {
	int a, b ;
	
	public ThisEx2(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Before Mthod call " + this.a + " and "+this.b);
		multiply(this);
	}
	
	void multiply(ThisEx2 t ) {
		t.a *= 5;
		t.b *=2 ; 
		System.out.println("after Mthod call " + this.a + " and "+this.b);
	}

	public static void main(String[] args) {
		ThisEx2 t= new ThisEx2(5, 3);

	}

}
