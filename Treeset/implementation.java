import java.util.*;
public class implementation{
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<Integer>();
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println(s.contains(10));
        //displaying the set in sorted order
        System.out.print(s);
        Iterator<Integer> it = s.iterator();
        while(it.hasNext()){
            System.out.print(" "+it.next());
        }
    }
}