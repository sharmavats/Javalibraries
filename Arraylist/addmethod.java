//add() method: The add() method in List interface is used to add an element just before the current iterator position.
import java.util.*;
public class addmethod{
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        ListIterator<Integer> it = l1.listIterator();
        while(it.hasNext()){
            
            //it.next();
            l1.add(5);
        }
        System.out.println(l1);
    }
}