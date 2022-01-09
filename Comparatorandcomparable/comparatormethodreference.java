import java.util.*;
import java.lang.*;
public class comparatormethodreference {
    public static void main(String[] args) {
        String arr[]={"GEEKS","FOR","geeks"};
        Arrays.sort(arr,String::compareToIgnoreCase);
    System.out.println(Arrays.toString(arr));
    }
}
