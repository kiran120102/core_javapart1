package packge1;

class DefaultClass{
	int a=10;
	void display() {
		System.out.println("Private Method : " + a);
	}
}

class DefaultSubClass extends DefaultClass{
	void displaySub() {
		System.out.println("Default Subclass");
	}
}

public class DefaultDemo {

	public static void main(String[] args) {
		DefaultSubClass d = new DefaultSubClass();
		System.out.println(d.a);
		d.display();
		d.displaySub();
	}

}
