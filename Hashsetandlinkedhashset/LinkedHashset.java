import java.util.*;
public class LinkedHashset {
   public static void main(String[] args) {
       Set<Integer> s = new LinkedHashSet<Integer>();
       s.add(10);
       s.add(20);
       s.add(30);
       for (int x : s) {
           System.out.print(x+" ");//order is maintained in it
           
       }
   } 
}
