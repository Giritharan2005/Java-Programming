import java.util.*;
public class hashmap{
        public static void main(String[] args) {
            Map<Integer, String> c = new HashMap<>();
            c.put(key:1, value: "A");
            c.put(key:2, value: "B");
            c.put(key: 3, value: "C");
            c.put(key:4, value: "D");
            c.put(key:5, value: "E");
            c.put(key:6, value: "F");
            c.put(key:7, value: "G");
            c.put(key:8, value: "H");
            c.put(key:9, value: "I");
            c.put(key: 10, value: "J");
            System.out.println(c);
            System.out.println(c.get(key:5));
            System.out.println(c.containsKey (key:7));
            System.out.println(c.containsValue (value:"Z"));
            System.out.println(c.keySet());
            System.out.println(c.values());
            System.out.println(c.entrySet());
            for (Map. Entry<Integer, String> i: c.entrySet()){
                System.out.println(if getKey() +" " + i.getValue());
            }
        }
}

