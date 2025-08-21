import java.util.Scanner;

public class countdigit {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int count = 0;
        do  {
            n = n / 10; 
            count++; 
 

        }
        while (n != 0) ;
            
        
        System.out.println("Number of digits: " + count);

    }
}
