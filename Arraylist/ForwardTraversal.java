import java.util.*;
public class ForwardTraversal {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        ListIterator<Integer> it = l1.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
