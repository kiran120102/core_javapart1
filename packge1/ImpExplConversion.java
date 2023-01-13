package packge1;

public class ImpExplConversion {

	public static void main(String[] args) {
		//implicit
		int x = 5;
		long y = x;
		float z = y;
		System.out.println("int value : " + x);
		System.out.println("long value : " + y);
		System.out.println("float value : " + z);

		//explicit 
		double d = 100.44;
		long l = (long)d;
		int i =(int)d;
		System.out.println("\ndouble value : " + d);
		System.out.println("long value : " + l);
		System.out.println("int value : " + i);
	}

}
