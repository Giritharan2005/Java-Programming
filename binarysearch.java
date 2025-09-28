public class binarysearch {
public static void main(String[] args) {
  int a[]={1,2,3,4,5};
  int find =3;
  int left=0;
  int right=a.length-1;
  boolean found = false;
  while(left<=right){
  int mid=(left+right)/2;
  if(a[mid]==find) {
  found=true;
  System.out.println("Found at index: "+mid);
  break;
}
   else if(a[mid]<find){
     left=mid+1;
}
  else{
    right=mid-1;
}
}
}
}