import java.util.*;
public class foreachtraversal {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<Integer>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.remove(40);
        for (int x : s) {
            System.out.println((x));
            
        }
    }
}
