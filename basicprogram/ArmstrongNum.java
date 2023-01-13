package basicprogram;

public class ArmstrongNum {

	public static void main(String[] args) {
        int number = 153, temp, rem, result = 0, count=0;
        
        temp = number;
        while (temp != 0){   
            temp = temp/10;
            count++;
        }

        temp = number;
        while (temp != 0){ 
            rem = temp % 10;
            result += Math.pow(rem, count);
            temp /= 10;
        }

        if(result == number) {
            System.out.println(number + " is an Armstrong number.");
        }
        else {
            System.out.println(number + " is not an Armstrong number.");
    
        }	
	}
}

