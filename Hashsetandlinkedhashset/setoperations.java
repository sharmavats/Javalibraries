import java.util.*;
public class setoperations {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        s1.add(10);
        s1.add(20);
        s1.add(40);
        s1.add(60);
        s1.add(70);
        s2.add(10);
        s2.add(30);
        s2.add(40);
        s2.add(70);
        System.out.println(s1.addAll(s2)); // This is used to append all of the elements from the mentioned collection(s2) to the existing set(s1). The elements are added randomly without following any specific order.
        System.out.println(s1);
        System.out.println(s1.retainAll(s2)); //This is used to retain from this set(s1) all of its elements that are contained in the specified collection(s2).
        System.out.println(s1);
        System.out.println(s1.removeAll(s2));//This is used to remove from this set(s1) all of its elements that are contained in the specified collection(s2).
        System.out.println(s1);
    }
}
