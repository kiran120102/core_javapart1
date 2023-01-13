package packge1;

class Student {
	int srno = 10;
	void display() {
		System.out.println("Eno : " +srno);
		
	}
}

class EngStudent extends Student{
	String spec = "IT";
	void displays() {
		System.out.println("Spec : " +spec);
	}
}

class cs extends Student{
	String y = "CS";
	void displayb() {
		System.out.println("Spec : " +y);
	}
	
}

class Hierarchical{
	public static void main(String[] args){
		EngStudent e = new EngStudent();
		e.display();
		e.displays();
		cs c = new cs();
		c.displayb();
	}
}
