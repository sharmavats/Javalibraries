import java.util.*;
public class specialconstructor{
    public static void main(String[] args){
        LinkedHashMap<Integer,String> m = new LinkedHashMap<Integer, String>(10,(float) 0.75,true);
       m.put(1, "kamal");
        m.put(2,"yash");
        m.put(3,"ravinder");
        m.put(4,"babita");
        System.out.println(m);
        m.put(2,"sharma") ;
        System.out.println(m);
    }
}