public class linearsearch {
    public static void main(String[] args) {
    int a[]={1,2,3,4,5};
    boolean found = false;
    int find =3;
    for(int i=0;i<a.length;i++) {
    if(a[i]==find) {
    found=true;
    System.out.println("Found at index: "+i);
    break;
    }
}
    }
}