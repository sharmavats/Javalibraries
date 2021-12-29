import java.util.*;
public class ListExample{
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        //adds 1 at index 0
        l1.add(0, 1);
        l1.add(1,2);
        System.out.println(l1);

        //Creating another list 
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        //will add list l2 from index 1
        l1.addAll(1,l2);
        System.out.println(l1);

        // removes element from index 1
        l1.remove(1);
        System.out.println(l1);

        //print element at index 2
        System.out.println(l1.get(2));

        //replace zeroth element with 5
        l1.set(0,5);
        System.out.println(l1);
    }
}