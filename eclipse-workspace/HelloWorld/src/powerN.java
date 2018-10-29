public class powerN {

	public static void main(String[] args) {
		System.out.println(printPowersOfN(4,3));
		System.out.println(printPowersOfN(5,6));
			
	}
	public static int printPowersOfN(int base, int n) {
	    int result = 1;
	    for (int i = 0; i < n; i++) {
	    System.out.print(result);
	    System.out.print(" ");
	        result *= base;
	    }

	    return result;
	}
}
