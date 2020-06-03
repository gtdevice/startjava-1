
public class unicode {
    public static void main(String[] args) {

     int i = 33;
     char unicode = 33;

     while(i <= 126) {
         unicode = (char)i;
         System.out.println("Число " + i + " соответствует unicode: " + unicode);
         i++;
     }
    }
}

