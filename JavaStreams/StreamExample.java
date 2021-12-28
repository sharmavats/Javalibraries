//java program demonstrate stream in java
import java.util.*;
import java.util.stream.*;
public class StreamExample{
     public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,9,8,15,18);
        // Taking the list as a source
        // Applying stream 
        // filtering out the even numbers
        //filtering out the numbers>10
        //rinting the list using method reference
        al.stream()
        .filter(x->x%2==0)
        .filter(x-> x>10)
        .forEach(System.out::println);
    }
}