package classobj;

class Student2{
	int rno;
	String name;
	static String CourseName;
}

public class StaticVar {

	public static void main(String[] args) {
		Student2 s1=new Student2();
		Student2 s2=new Student2();
		Student2 s3=new Student2();
		
		Student2.CourseName="Java full Stack";
		
		s1.rno=1;
		s1.name="abc";
		
		s2.rno=2;
		s2.name="pqr";
		
		s3.rno=3;
		s3.name="xyz";

		System.out.println("s1 roll no : " + s1.rno +" s1 name : "+s1.name +"s1 course name : "+ s1.CourseName);
		System.out.println("s2 roll no : " + s2.rno +" s2 name : "+s2.name +"s2 course name : "+ s2.CourseName);
		System.out.println("s3 roll no : " + s3.rno +" s3 name : "+s3.name +"s3 course name : "+ s3.CourseName);
		
		s2.CourseName="Python";
		s2.name="ABC";
		
		System.out.println("s1 roll no : " + s1.rno +" s1 name : "+s1.name +"s1 course name : "+ s1.CourseName);
		System.out.println("s2 roll no : " + s2.rno +" s2 name : "+s2.name +"s2 course name : "+ s2.CourseName);
		System.out.println("s3 roll no : " + s3.rno +" s3 name : "+s3.name +"s3 course name : "+ s3.CourseName);
		
	}

}
