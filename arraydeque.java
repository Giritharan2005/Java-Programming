import java.util.*;
public class arraydeque{
    public static void main(String[] args) {
        Deque<Integer> c = new ArrayDeque<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.addFirst(78);
        c.addLast(90);
        c.addFirst(34);
        c.remove();
        c.removeFirst();
        c.removeLast();
        for(int i: c) {
            System.out.print(i +" ");
            }
    }
}