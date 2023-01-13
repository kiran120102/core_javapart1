package classobj;

public class Demo {
	
	private int a=10;
	
	private void display(){
		System.out.println("Value of a : " + a);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();

	}

}
