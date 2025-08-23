import java.util.*;
class arraylistex {
    public static void main(String[] args) {
        ArrayList<Object> l=new ArrayList<>();
        l.add("apple");
        l.add("grapes");
        l.add("banana");        
        l.add(1);
        l.add(1.5);
        l.add(null);
        l.remove(4);
        l.set(4,2);
        System.out.println(l.get(3));
        System.out.println(l.size());
        System.out.println(1);
        System.out.println(l.contains("apple"));
        System.out.println(l);
        System.out.println(l.indexOf("grapes"));
        System.out.println(l.isEmpty());
        l.clear();
        System.out.println("The given list is cleared : "+l);
    }
}
