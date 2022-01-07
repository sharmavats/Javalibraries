import java.util.*;
public class implementation{
    public static void main(String[] args){
TreeMap<Integer,String> t = new TreeMap<>();
t.put(1,"kamal");
t.put(2,"sharma");
t.put(3,"tapish");
t.put(4,"dahiya");
System.out.println(t);
System.out.println(t.isEmpty());
t.remove(4);
System.out.println(t);
    }
}