package classobj;

public class ConstructorEx {
	String name;
	String city;
	int rollno;
	String Course;
	
	private ConstructorEx() {
		System.out.println("Default .");
		name = "Kiran";
	}
	
	ConstructorEx(String city){
		this.city = city;
		System.out.println("I stay at : " + city);
	}
	
	ConstructorEx(int r, String cr){
		rollno = r;
		Course = cr;
		System.out.println("Roll no & Course : " + rollno + " " + Course);
	}
	
	ConstructorEx(ConstructorEx a){
		System.out.println("Copy constructor");
		rollno = a.rollno;
		Course = a.Course;
	}
	
	public static void main(String[] args) {
		ConstructorEx c = new ConstructorEx();
		System.out.println("My name is : " + c.name);
		ConstructorEx c1 = new ConstructorEx("Mumbai");
		ConstructorEx c2 = new ConstructorEx(66, "IT");
		ConstructorEx c3 = new ConstructorEx(c2);
		System.out.println("copy Roll no & Course : " + c3.rollno + " " + c3.Course);
			
	}
	

}
