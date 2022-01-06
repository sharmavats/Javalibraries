import java.util.*;
public class mapinterface {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(20009,"kamal");
        m.put(20010, "himanshu");
        m.put(20011,"parshant");
        System.out.println(m.get(20009));
        m.remove(20011);
        System.out.println(m.isEmpty());
        m.put(20011,"parshant");
        System.out.println(m.containsKey(20010));
        System.out.println(m.containsValue("parshant"));
        System.out.println(m.size());
    }
}
