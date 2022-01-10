import java.util.*;
public class FrequencyArrayList {
    public static void main(String[] args) {
        Integer arr[] = {10,12,10,14,10};
        int a =Collections.frequency(Arrays.asList(arr), 10);
System.out.println(a);
    }
}
