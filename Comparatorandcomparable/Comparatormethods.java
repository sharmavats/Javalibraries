import java.util.*;
public class Comparatormethods {
    public static void main(String[] args) {
        String arr[]= {"geeks","null","weebs","null"};
        Arrays.sort(arr,Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(arr));
    }
}
