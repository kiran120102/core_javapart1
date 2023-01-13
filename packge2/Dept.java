package packge2;
import java.util.Scanner;

import packge1.*;  

public class Dept extends EmployeeClass{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter Eno and Ename : ");
		int a = s.nextInt();
		String s1 = s.next();
		EmployeeClass e = new EmployeeClass();
		e.display(a, s1);
		
	}

}
