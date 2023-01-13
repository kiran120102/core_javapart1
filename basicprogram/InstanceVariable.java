package basicprogram;
class Subject{
	int javaMarks;	// instance variable
	int pythonMarks;
	String subName = "Java";
}
public class InstanceVariable {
	
	public void displayAge() {
		int age = 0;	// local variable
		age += 10;
		System.out.println("Age : " + age);
	}
	public static void main(String[] args) {
		InstanceVariable iv = new InstanceVariable();
		iv.displayAge();
		
		Subject s = new Subject();
		s.javaMarks = 45;
		s.pythonMarks = 44;
		System.out.println("java Marks : " + s.javaMarks);
		System.out.println("Python Marks : " + s.pythonMarks);
		System.out.println("Subject Name : " + s.subName);
		
	}

}
