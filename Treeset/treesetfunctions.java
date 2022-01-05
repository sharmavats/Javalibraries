import java.util.*;
public class treesetfunctions {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<Integer>();
        s.add(10);
        s.add(15);
        s.add(20);
        s.add(30);
       System.out.println( s.lower(15));
       System.out.println( s.higher(10));
       System.out.println(s.floor(11));
       System.out.println(s.ceiling(15));
    }
}
