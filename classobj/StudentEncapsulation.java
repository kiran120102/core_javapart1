package classobj;

public class StudentEncapsulation {

	public static void main(String[] args) {
//		Student s = new Student();
//		s.setRno(66);
//		s.setName("Kiran");
//		s.setCity("Badlapur");
//		System.out.println("Roll no : " + s.getRno());
//		System.out.println("Name : " + s.getName());
//		System.out.println("City : " + s.getCity());
		
		Student s = new Student(66, "Kiran","Badlapur");
		System.out.println("Roll no : " + s.getRno());
		System.out.println("Name : " + s.getName());
		System.out.println("City : " + s.getCity());
		
		s.setRno(35);
		System.out.println("Roll no : " + s.getRno());
	}

}
