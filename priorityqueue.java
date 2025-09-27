import java.util.PriorityQueue;

public class priorityqueue{
    public static void main(String[] args){
        PriorityQueue<String> c = new PriorityQueue<>();
        c.add("Hari");
        c.add("aDhivish");
        c.add("Giri");
        c.add("Dinesh");
        c.add("Sachin");
        while (!c.isEmpty()){
            System.out.println(c.poll() + " ");
        }
    }
}