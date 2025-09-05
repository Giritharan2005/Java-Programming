import java.util.*;
public class repeat
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values : ");
		int num = sc.nextInt();
		int a[] = new int[num];
		for(int i=0 ; i<num ; i++){
		    a[i]= sc.nextInt();
		}
		boolean d = false;
		int b =0;
		for(int i=0 ; i<num ;i++){
		    for(int j = i+1 ; j<num ; j++){
		        if(a[i]==a[j]){
		           d = true;
		           System.out.println("The first repeated value is :" +a[i]);
		            break;
		        }
		        
		    }
		    if(d) break;
		    
		}
		if (!d) {
            System.out.println("No repeated values found.");

		}
	}
}