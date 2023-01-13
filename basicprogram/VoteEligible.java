package basicprogram;

public class VoteEligible {

	public static void main(String[] args) {
		int age = 25;
		String result = (age >= 18)? "You are eligible to Vote":"You are not eligible to Vote"; 
		System.out.println(result);

	}

}
