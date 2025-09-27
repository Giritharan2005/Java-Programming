import java.util.*;
public class hashset{
    public static void main(String[] args){
    int a[]={10,50,10,30,40,20};
    Set<Integer> c = new HashSet<>();
    for(int i: a){
        c.add(i);
    }
    System.out.println(c);
    }
}