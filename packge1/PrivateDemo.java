package packge1;

class PrivateClass{
	private int a=10;
	private void display() {
		System.out.println("Private Method : " + a);
	}
}

public class PrivateDemo {

	public static void main(String[] args) {
		PrivateClass p = new PrivateClass();
		System.out.println(p.a);
		p.display();	//scope of private methods and variable is within class

	}

}
