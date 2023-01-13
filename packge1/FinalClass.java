package packge1;

class FinalClass {
	final int a=10;
		public void display() {
		    System.out.println("final class");
		  }
	}

class FinalMethod extends FinalClass{
	
	public final void display() {
			super.a=20;
		     System.out.println("final method");
		}
	}

public class FinalEg extends FinalMethod{
	public final void display() {
		   System.out.println("The final method is overridden.");
	}
		
	public static void main(String[] args) {
			FinalEg f = new FinalEg();
			
			final int AGE = 20;
			AGE = 25;
		    System.out.println("Age " + AGE);
	}
	
}
