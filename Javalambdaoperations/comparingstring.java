//Java code to compare two arrays of Strings ignoring the cases.
import java.util.*;
public class comparingstring {
    public static void main(String[] args) {
        //Arrays of strings
        String a[] = {"JAVA","DSA","LIBRARY"};
        String b[] = {"java","dsa","library"};
        // equals() method to compare ignoring the cases
        //third parameter is a comparator using which we can define
        //the basis of comparison
        if(Arrays.equals(a,b, String::compareToIgnoreCase)){
            System.out.print("yes");
        }
        else{
            System.out.println("NO");
        }
    }
}
