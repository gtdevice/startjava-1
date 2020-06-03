public class Cycle {
 public static void main(String[] args) {

	 System.out.println("FOR cycle:"); 
	 for(byte i = 0;i <= 20; i++) {
		 System.out.println(i); 
	 }

	 System.out.println("WHILE cycle:"); 
	 int i = 0;
	 int result = 8;
	 while(i <= 6) {
	 	 result = result - 2;
		 System.out.println(result); 
		 i++;
	 }

	 System.out.println("DO WHILE cycle:"); 
	 i = 10;
	 result = 0;
	 do {
		 if (i % 2 == 0) {
		 } else {
		  result = result + i;
		 }
		 i++;
	 } while(i <= 20);
	  System.out.println("[10;20] sum odd is: " + result); 
 }
}