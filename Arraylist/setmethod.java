import java.util.*;
public class semethod {
    public static void main(String[] args) {
       List<Integer> l1= new ArrayList<Integer>();
       l1.add(12);
       l1.add(13);
       l1.add(14);
       ListIterator<Integer> it = l1.listIterator(l1.size());
       while(it.hasPrevious()){
       int x=(Integer)it.previous();
       it.set(x*2);
       } 
       System.out.println(l1);
    }
}
