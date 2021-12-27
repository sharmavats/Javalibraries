//java code to illustrate method reference using a static method
import java.util.*;
public class methodreference2{
    public static void main(String[] args){
    List<Integer> a1 = Arrays.asList(2,3,4,5,6);
    //foreach() method takes the method reference 
    //being a static method, its reference can be passed using the class name i.e methodreference2

   a1.forEach(methodreference2::square);
    }
    public static void square(Integer x){
        System.out.println(x*x);
    }
}