public class While {
	public static void main (String[] args) {
	
	 int i = 2;	 
	 int result = 1;

   while(i <= 5){
   	 result = result + i;
		 if (result % 2 == 0) {
		   System.out.println(result + " is an even number");
		 } else {
			 System.out.println(result + " is an odd number");
		 }
		 i++;
   }

	 System.out.println("1 + 2 + 3 + 4 + 5 = " + result);
	}
}

