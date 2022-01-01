import java.util.*;
public class clearandempty {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(12);
        al.add(14);
        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());
    }
}
