import java.util.*;
public class sortstring{
public static void main(String[] args) {
String s="hello";
char[] ch=s.toCharArray();
Arrays.sort(ch);
for(int i = 0 ;i<ch.length;i++){
System.out.print(ch[i]);
}
}
}