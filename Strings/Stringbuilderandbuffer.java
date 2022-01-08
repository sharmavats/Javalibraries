import java.util.*;
public class Stringbuilderandbuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("geeks for");
        StringBuffer s = str; // s refers to the same location as str
        s.append("geeks");// append operation modifies the same object as it is mutuable in nature 
        if (str==s){
            System.out.println("both are equal");
            }  
            else{
             System.out.println("both are not equal");
            }
    }
}
