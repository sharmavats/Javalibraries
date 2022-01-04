import java.util.*;
public class queuemethods {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
       System.out.println(q);
       q.remove();
       q.remove(20);
       System.out.println(q);
       System.out.println(q.peek());
       System.out.println(q.poll());
    }
}
