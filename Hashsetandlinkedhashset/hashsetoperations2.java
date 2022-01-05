//size , remove , isempty , traversal for each
import java.util.*;
public class hashsetoperations2 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("geeks");
        s.add("for");
        s.add("Geeks");
        System.out.println(s);
        System.out.println((s.size()));
        s.remove("geeks");
        System.out.println((s.isEmpty()));
        s.add("geeks");
        for (String x : s) {
          System.out.print(x+" ");          
        }

    }
}
