import java.util.Scanner;

public class Guesses {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		
		int number = 48;
		int numberyoutry = 1;
		
		System.out.print("Your guesse ");
		int guess = console.nextInt();
		
		while(guess!=number) {
			System.out.print("Incorrect ");
			System.out.print("Try other guesse =");
			guess = console.nextInt();
			numberyoutry++;
		}
		System.out.print("Yes you got it \ntotal guesses =" + numberyoutry);
		
	}

}
