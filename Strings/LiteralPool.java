import java.util.*;
public class LiteralPool {
    public static void main(String[] args) {
       String s1 = "geeks";
       String s2 = "geeks";
       if (s1==s2){
           System.out.println("both are equal");
           }  
           else{
            System.out.println("both are not equal");
           }
           String s3 = new String("geeks");
           if (s1==s3){
            System.out.println("both are equal");
            }  
            else{
             System.out.println("both are not equal");
            }
    }
}
