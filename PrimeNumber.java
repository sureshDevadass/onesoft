import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = s.nextInt();
		
		boolean isPrime = true;
		for(int i=2; i< num; i++) {
			if(num % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime==true) {
			System.out.println(num  + " is a Prime Number");
		}
		else {
			System.out.println(num  + " is not a Prime Number");
		}
		
		
	}
	
	
	
	
}
