import java.util.*;
public class implementation{
    public static void main(String[] args){
     //Deque<Integer> d = new LinkedList<Integer>();
      Deque<Integer> d= new ArrayDeque<Integer>();
      d.offerFirst(10);
      d.offer(20);// insert from tail by default
      d.offerLast(0);
      System.out.println(d);
      System.out.println(d.peekFirst());  
      System.out.println(d.peekLast());  
      System.out.println(d.pollFirst());
      System.out.println(d);  
    }
}