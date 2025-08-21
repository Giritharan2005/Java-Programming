import java.util.Scanner;

public class  reversearray{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[4];
        System.out.print("Enter a  Number: ");
        for(int i=0;i<4;i++){
            arr[i]=s.nextInt();
        }
        System.out.println( "Reversed String");
        for(int i=arr.length-1;i>=0;i--){
            
            System.out.print( " "+arr[i]);
        }
    }
}



