package basicprogram;

public class MaxNum {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println("result : " + ((a > b)? "a is max":"b is max"));
		System.out.println("result : " + ((a>=b && a>=c)? "a is greater": b>=a && b>=c  ?"b is greater": "C is greater"));
	}

}
