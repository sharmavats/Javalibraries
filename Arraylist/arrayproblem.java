import java.util.*;
public class arrayproblem {
    public static void main(String[] args) {
        int arr[]={24,56,36,75,45,35,67,32};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>20){
                al.add(arr[i]);
            }
        }
        System.out.println(al);
    }
}
