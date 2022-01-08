import java.util.*;
public class stringbuilderandbuffermethods {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("geeks for Geeks");
        System.out.println(s.reverse());
        System.out.println(s.append("weebs"));
       s.setCharAt(1,'c');
        System.out.println(s.deleteCharAt(2));
        System.out.println(s.delete(2, 3));
    }
}
