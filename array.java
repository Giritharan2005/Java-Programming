import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        System.out.print("Enter a  Number: ");
        for(int i=0;i<5;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println("Number " + i + ": " +arr[i]);
           sum=sum+arr[i];
        }
         
            System.out.println("Sum of Array Number  " +sum);
            System.out.println(" Average of ArrayNumber " +(sum/arr.length));
            
            System.out.println("Search of Array Number by using index value " +arr[2]);

            

    }
}



