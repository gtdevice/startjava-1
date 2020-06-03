public class For {
	public static void main (String[] args) {
	
	 int result = 1;
		for(int i = 2; i <= 5; i++){
			result = result + i;
			if (result % 2 == 0) {
				System.out.println(result + " is an even number");
			} else {
				System.out.println(result + " is an odd number");
			}
		}
			System.out.println("1 + 2 + 3 + 4 + 5 = " + result);
	}
}

