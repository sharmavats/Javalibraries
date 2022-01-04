import java.util.Deque;
import java.util.LinkedList;

// deque methods that throws exceptions 
public class Dequemethods {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<Integer>();
        d.addFirst(10);
        d.addFirst(20);
        d.addFirst(30);
        d.addFirst(40);
        d.addLast(0);
        System.out.println(d);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        System.out.println(d);
        System.out.println(d.removeFirst());
        System.out.println(d.removeLast());
        System.out.println(d);

    }
}
