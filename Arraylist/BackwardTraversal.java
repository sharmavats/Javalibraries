import java.util.*;
public class BackwardTraversal {
    public static void main(String[] args) {
        //create a list
       List<Integer> l1 = new ArrayList<Integer>();
       //addig elements to list
       l1.add(1);
       l1.add(2);
       l1.add(3);
       //iterator pointing toposition just after the last element i.e size = 4 
       ListIterator<Integer> it = l1.listIterator(l1.size());
       //while there is a previous element of the current iterator
       while(it.hasPrevious()){
           System.out.println(it.previous());
       } 
    }
}
