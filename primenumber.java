import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print
        ("Enter a Number : ");
        int n=s.nextInt();
                boolean isPrime = true;

        if (n <= 1) {
            isPrime = false; 
        } else {
            for (int i = 2; i < n ; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }

    }
    
}
