import java.util.*;
public class arraymethods{
    public static void main(String[] args){
        Integer arr[]={12,14,16,19,14};
        Integer arr1[]={12,14,16,17,19,14};
        System.out.println(Arrays.compare(arr, arr1));
        List<Integer> l = Arrays.asList(arr);
         System.out.println(l);
         System.out.println(Arrays.binarySearch(arr, 12));
         System.out.println(Arrays.equals(arr,arr1));
         System.out.println(Arrays.mismatch(arr,arr1));
         Arrays.sort(arr1);
         System.out.println(Arrays.toString(arr1));

    }
}