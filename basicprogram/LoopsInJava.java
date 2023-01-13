package basicprogram;

public class LoopsInJava {

	public static void main(String[] args) {
		//for Loop
		System.out.println("For Loop : ");
		for(int i=1;i<=5;i++) {
			System.out.println("i : " + i);
		}
		
		//while loop
		System.out.println("While Loop : ");
		int j=5;
		while(j>=1) {
			System.out.println("j : " + j);
			j--;
		}
		
		//do while loop
		System.out.println("Do While Loop : ");
		int k=1;
		do {
			System.out.println("k : " + k);
			k++;
		}while(k<=5);

	}

}
