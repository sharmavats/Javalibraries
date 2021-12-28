//java code to find the sum of arrat using stream in java
import java.util.*;
import java.util.stream.*;
public class sum {
   public static void main(String[] args) {
       int arr[] = {30,20,10};
       //Converting arr to stream 
       //Then finding sum of he stream
       int sum = Arrays.stream(arr)
       .sum();
       //Displaying the sum
       System.out.println(sum);
   } 
}
