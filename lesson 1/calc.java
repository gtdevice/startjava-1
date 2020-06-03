import java.util.Scanner;
 
public class calc {
    public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in);

 	 System.out.println("Простой калькулятор"); 
     int result = 0;
     int i = 0;
     int number3 = 0;

     System.out.println("Введите мат. знак:"); 
      String math = scanner.nextLine();  

 	 System.out.println("Введите первое число:"); 
      int number1 = scanner.nextInt();

 	 System.out.println("Введите второе число:"); 
      int number2 = scanner.nextInt();


     if(math.equals("+")){
     	 result = number1 + number2;
     }else if(math.equals("-")){
     	 result = number1 - number2;
     }else if(math.equals("*")){
     	 result = number1 * number2;
     }else if(math.equals("/")){
     	 result = number1 / number2;

     }else if(math.equals("^")){
     	 number3 = number1;
	     while(i < number2-1) {
	 	     number3 = number3 * number1;
		     i++;
	     }
     	 result = number3;

     }else if(math.equals("%")){
     	 result = number1 % number2;
     }else{
      System.out.println("Вы ввели неверное мат. действие!");
    	
     }

     System.out.println(number1 + math + number2 + "=" + result);
    }
}