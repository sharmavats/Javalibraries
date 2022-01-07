import java.util.*;
public class traversal {
    public static void main(String[] args) {
        TreeMap<Integer,String> t = new TreeMap<>();
        t.put(1,"kamal");
        t.put(2,"sharma");
        t.put(3,"tapish");
        t.put(4,"dahiya");
        for ( Map.Entry<Integer,String> e : t.entrySet()) {
            System.out.println(e.getKey()+" "+ e.getValue());
        }  
    }
}
