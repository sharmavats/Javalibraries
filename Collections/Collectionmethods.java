import java.util.*;
public class Collectionmethods{
    public static void main(String[] args){
    List<Integer> l = new ArrayList<Integer>();
    Integer arr[]= {23,13,18,82};
    l.add(12);
    l.add(17);
    l.add(14);
    l.add(15);
    l.add(10);
    l.add(8);
    Collections.sort(l);
    System.out.println(l);
    Collections.reverse(l);
    System.out.println(l);
    Collections.fill(l, 7);
    System.out.println(l);
    List<Integer> l2 = Arrays.asList(arr);
    Collections.reverse(l2);//Arrays class in Java doesn't have reverse method. We can use Collections.reverse() to reverse an array also by using asList() method.
    System.out.println(l2);
    System.out.println(Collections.binarySearch(l2, 17));
    System.out.println(Collections.binarySearch(l2, 18));
    System.out.println(Collections.max(l));
    System.out.println(Collections.min(l));
    System.out.println(Collections.frequency(l, 15));


    }
}