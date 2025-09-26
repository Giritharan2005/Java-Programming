import java.util.*;
class treesetex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        TreeSet<Integer> t = new TreeSet<>();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            t.add(sc.nextInt()); 
        }

        System.out.println("Sorted unique elements:");
        for (int i : t) {
            System.out.print(i + " ");
        }
    }
}
