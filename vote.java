import java.util.*;
public class vote{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your age: ");
      int n = sc.nextInt();
    if(n<18)
      {
        throw new IllegalArgumentException("Your age should be above 18");
    }
      else{
        System.out.println("You are eligible to vote.");
      }

        }    
    
}