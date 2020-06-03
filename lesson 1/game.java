import java.util.Scanner;
 
public class game {
    public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);

    	 int numberRand = 25;
    	 int i = 0;
    	 int b = 2;

         System.out.println("Угадайте число от 0 до 100:"); 
         int numberPlayer = scanner.nextInt();


	     while(i <= b) {
             if (numberRand == numberPlayer){
                 System.out.println("Вы угадали!");
                 i = b; 
             }else{
             	 if (numberPlayer > numberRand){
					 System.out.println("Введенное вами число больше того, что загадал компьютер");
				 } else if(numberPlayer < numberRand){
					 System.out.println("Введенное вами число меньше того, что загадал компьютер");
				 }
                 System.out.println("Попробуйте еще раз:"); 
                 numberPlayer = scanner.nextInt();
                 b++;
             }
		     i++;
	     }
     }
}

