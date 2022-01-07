import java.util.TreeMap;

public class methods {
    public static void main(String[] args) {
        TreeMap<Integer,String> t = new TreeMap<>();
        t.put(10,"geeks");
        t.put(5,"for");
        t.put(15,"Weebs");
        t.put(20,"Programming");
        System.out.println(t);
        System.out.println(t.lowerKey(10));
        System.out.println(t.higherKey(16));
        System.out.println(t.floorKey(12));
        System.out.println(t.ceilingKey(15));
        System.out.println(t.ceilingEntry(15).getValue());
        System.out.println(t.floorEntry(12).getValue());
        System.out.println(t.lowerEntry(18).getValue());
        System.out.println(t.higherEntry(15).getValue());
    }
}
