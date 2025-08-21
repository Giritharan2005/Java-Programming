import java.util.Scanner;

public class arraysearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[4];
       
        System.out.print("Enter a  Number: ");
        for(int i=0;i<4;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Enter element to search: ");
        int search = s.nextInt();
        
        for(int i=0;i<4;i++){
            if(arr[i]==search){
                System.out.print("Search of index  Number: "+i);
            }
        }

    }
}



