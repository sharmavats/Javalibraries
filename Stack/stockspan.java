//time complexity= o(n)
//space complexity = o(n)
import java.util.*;
public class stockspan {
    static void span(int arr[]){
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(0);
        int span=1;
        System.out.print(span+" ");
        for(int i=1; i<arr.length; i++){
            while(stack.isEmpty()==false&&arr[stack.peek()]<=arr[i]){
             stack.pop();
            }
            span=(stack.isEmpty())?i+1:(i-stack.peek());// if empty then span is index +1 else index-previou greater element 
            System.out.print(span+" ");
stack.push(i);
            
        }
    }
   public static void main(String[] args) {
      int arr[]={60,10,20,40,35,38,50,70,65};
       span(arr);
   } 
}
