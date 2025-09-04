
import java.util.Scanner;

public class  multidimensionalarray{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Multidimensional array Number: ");
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("MultiDimensional array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}




