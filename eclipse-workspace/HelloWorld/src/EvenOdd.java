import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("Enter a Number: ");
		int number = console.nextInt();
		
		if (number %2==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");			
		}
	}
	
	
}
