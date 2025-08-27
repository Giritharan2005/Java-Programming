import java.util.*;
public class coin{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int amount=sc.nextInt();
int arr[]=new int[n];
for(int i = 0 ;i<n;i++){
arr[i]=sc.nextInt();
}
int count=0;
for(int i=arr.length-1; i >= 0 ;i--){
while (amount>=arr[i]){
count++;
amount=amount-arr[i];
}
if(amount==0) {
System.out.println(count);
break;
}
}
}
}