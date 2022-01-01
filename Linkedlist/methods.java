import java.util.*;
public class methods {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(70);
        l.add(80);
        l.add(90);
        System.out.println(l.peek());
        System.out.println(l);
        System.out.println(l.poll());
        System.out.println(l);
        l.addFirst(10);
        System.out.println(l);
    }
}
