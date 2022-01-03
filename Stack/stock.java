import java.util.*;
public class stock{
    
    static void span(int arr[]){
        System.out.print(1);
        //int span=1;
    for(int i=1; i<=arr.length-1; i++){
        int count =1;
        for( int j=i-1; (j>=0)&&(arr[i]>=arr[j]); j--){
        count = i-j+1;
        }
        System.out.print(" "+count);
    }
    
    }
    
    public static void main(String[] args){
        int arr[] = {60,10,20,40,35,38,50};
        span(arr);
    }
}