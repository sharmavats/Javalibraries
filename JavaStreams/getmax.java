import java.lang.reflect.Array;
//java code to find the max of array using stream in java
import java.util.*;
import java.util.stream.*;
public class getmax {
    public static void main(String[] args) {
        int arr[] = {10,20,34,15};
        // the max() returns an optional int whichis the type
        // of the primitive array getAsInt() gets the integer from the optional int
        int max=Arrays.stream(arr)
        .max()
        .getAsInt();
// Displaying the sum
        System.out.println(max);
    }
}
