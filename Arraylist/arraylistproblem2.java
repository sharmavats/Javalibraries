// Given an array of N integers and a value K. The task is to return a list of integers from the given array whose value is less than K.
import java.util.*;
public class arraylistproblem2 {
    static List<Integer> getsmaller(int arr[], int k){
        List<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>k){
                al.add(arr[i]);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int arr[]={10,12,14,17,18};
        List<Integer> al= getsmaller(arr, 15);
        for (Integer x : al) {
            System.out.println(x);
            
        }
    }
}
