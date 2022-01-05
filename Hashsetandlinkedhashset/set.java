import java.util.*;
public class set{
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        //duplicate wont be added
        s.add(20);
        System.out.println(s);
    }
}