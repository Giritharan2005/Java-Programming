public class armstrong
{
  static int digit_count(int n){
  int count=0;
  while (n!= 0) {
  count++;
   n/=10;
}
   return count;
}
public static void main(String[] args) {
   int n = 370;
   int temp=n;
   int sum=0;
   int rem;
   int digit=digit_count(n);
   while(n!= 0) {
   rem=n%10;
   sum+=Math.pow(rem, digit);
   n/=10;
   }
  if(temp==sum) {
     System.out.println("Armstrong number");
}
  else{
     System.out.println("Not armstrong number");
  }
}
}