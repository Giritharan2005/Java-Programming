import java.util.*;

public class reversednumber {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the value: ");
      int a = scan.nextInt();
      int b = a ;
      int c = 0 ,d = 0;
      while(b!=0){
        c = b%10;
        d = d*10 + c;
        b /= 10; 
      }
      System.out.println("The reverse of the " + a + " is " +d);
  }
}


