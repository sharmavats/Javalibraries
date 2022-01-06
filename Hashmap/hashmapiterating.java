import java.util.*;
public class hashmapiterating {
   public static void main(String[] args) {
       HashMap<Integer,String> h = new HashMap<Integer,String>();
       h.put(20009, "kamal");
       h.put(20010, "himanshu");
       h.put(20011, "parshant");
       h.put(20012, "tarun");
       System.out.println(h);
       System.out.println(h.size());
       for ( Map.Entry<Integer, String>m : h.entrySet() ) {
         System.out.println(m.getKey()+" "+m.getValue());
       }
   } 
}
