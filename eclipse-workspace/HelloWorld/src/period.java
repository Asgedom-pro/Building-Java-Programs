import java.util.Scanner;

public class period {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("inter the month: ");
		int month=console.nextInt();
		System.out.print("Inter the date: ");
		int date=console.nextInt();
		System.out.print("The season is: "+season(month,date));
		

	}
	
	public static String season(int month, int date) {
		
		if((month>=12 && date >=16)&&(month>=3 && date >=15)){
		return "Winter";
		}
		else if ((month>=3 && date >=16)&&(month>=6 && date >=15)) {
		return "Spring";
		}
		else if ((month>=6 && date >=16)&&(month>=9 && date >=15)) {
		return "Summer";
		}
		else ;
		return "Fall";
	}
	

}
