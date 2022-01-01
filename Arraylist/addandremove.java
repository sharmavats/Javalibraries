import java.util.*;
public class addandremove {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks");
        al.add(1,"for");
        al.add("Geeks");
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        al.remove("Geeks");
System.out.println(al);
    }
}
