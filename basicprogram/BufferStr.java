package basicprogram;

public class BufferStr {

	public static void main(String[] args) {
		String s = new String("Cooking");
		s.concat("pasta");
		System.out.println(s);
		
		StringBuffer str = new StringBuffer("Cooking");
		str.append("Emerging");
		System.out.println(str);
		
		str.insert(15, "Technology");
		System.out.println(str);
		
		str.replace(8, 16, "IoT");
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.capacity());
		
	}

}
