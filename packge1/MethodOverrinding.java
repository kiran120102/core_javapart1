package packge1;

class Emp{
	String ename = "Chetana";
	int eno;
	Emp(int eno){
		this.eno=eno;
	}
	void Display(){
		System.out.println("Employee Class");
	}
}

class Dept extends Emp{
	String ename = "PQR";
	Dept(){
		super(19);
	}
	void Display(){
		super.Display();
		System.out.println("Dept Class " + ename);
	}
}

public class MethodOverrinding {

	public static void main(String[] args) {
		Dept d = new Dept();
		d.Display();
	}

}
