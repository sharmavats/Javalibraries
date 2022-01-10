import java.util.*;
public class frequency {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(10);
        l1.add(30);
        System.out.print(Collections.frequency(l1, 10));
    }
}
