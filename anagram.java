import java.util.*;
 public class anagram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String s1 = sc.next();
        System.out.print("Enter second word: ");
        String s2 = sc.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length()==s2.length()){
            char ch1[] = s1.toCharArray();
            char ch2[] = s2.toCharArray();
            System.out.println();
             Arrays.sort(ch1);
             Arrays.sort(ch2);
            for(int i = 0; i< ch1.length ; i++){
                 System.out.print(ch1[i] +" ");
            }
            System.out.println();
            for(int i = 0; i< ch2.length;i++){
               System.out.print(ch2[i]+" ") ;
            }
            System.out.println();
            if(Arrays.equals(ch1,ch2)){
                System.out.println("It is anagram");
            }
            
            else{
                System.out.println("It is not an anagram");
            }
        }
        else{
            System.out.println("It is not an anagram");
        }
    }
}