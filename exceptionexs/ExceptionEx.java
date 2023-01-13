package exceptionexs;

public class ExceptionEx {
	
	
	public static void main(String[] args) {
		try {
			int b= 4;
			int a =2;
			int c=a/b;
			System.out.println("value of c: " + c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finall Block");
		}

	}

}
