package basicprogram;

public class StaticVariable{
	   public static void main(String args[]){
	     Student s1 = new Student();
	     s1.showData();
	     Student s2 = new Student();
	     s2.showData();
	     Student s3 = new Student();
	     s3.showData();
	     Student s4 = new Student();
	     s4.showData();
	     
	  }
	}

	class Student {
	int a; 
	static int b; //initialized to zero only when class is loaded not for each object created.

	  Student(){
	   
	   a++;
	  }

	   public void showData(){
	      System.out.println("Value of a = "+a);
	      System.out.println("Value of b = "+b);
	   }
	}

