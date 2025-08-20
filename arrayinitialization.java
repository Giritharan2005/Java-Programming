import java.util.Scanner;

public class arrayinitialization {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[4];
        System.out.print("Enter a  Number: ");
        for(int i=0;i<4;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<4;i++){
            System.out.println("Number " + i + ": " +arr[i]);
        }

    }
}



