//java code to find the double of array using stream in java
import java.util.*;
public class Average{
    public static void main(String[] args){
    int arr[] = {12,13,17,18};
    // The average() returns an optional double 
    //getAsDouble() gets the double from the optional double
    double avg=Arrays.stream(arr)
    .average()
    .getAsDouble();

    //displaying the average
    System.out.println(avg);
    }
}