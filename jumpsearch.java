public class jumpsearch{
public static void main(String[] args) {
int a[]={1,2,3,4,5,6,7,8,9,10};
int find =7;
int n=a.length;
int step=(int) Math.sqrt(n);
int prev=0;
boolean found = false;
while(a[Math.min(step, n)-1]<find){
prev=step;
step+= (int) Math.sqrt(n);
if(prev>=n) {
System.out.println( "Not Found");
return;
}
}
while(a[prev]<find){
prev++;
if(prev==Math.min(step,n)) {
System.out.println("Not Found");
return;
}
}
if(a[prev]==find){
found=true;
System.out.println("Found at index: "+prev);
}
}
}