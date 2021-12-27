import java.util.*;
public class methodreference1 {
    public static void main(String[] args) {
        List<Integer> a1 = Arrays.asList(10,20,30,40);
        a1.forEach(System.out::println);
    }
}
