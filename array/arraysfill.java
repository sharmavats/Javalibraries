import java.util.*;
public class arraysfill {
    public static void main(String[] args) {
        Integer[] arr = {15,71,45,98}; //Firstly, Integer is a class/object while int is a primitive type. Integer is a wrapper for int. If you need a null value to be stored, or need to use collection, use Integer. 
    Arrays.fill(arr, 7);
    System.out.println(Arrays.toString(arr));
    Integer arr1[]={12,15,16,18,17};
    Arrays.fill(arr1, 0, 2, 7);
    System.out.println(Arrays.toString(arr1));
    }
}
