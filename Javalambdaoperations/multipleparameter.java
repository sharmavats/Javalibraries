//java code to illustrate lambda exression with single functional
//interface test with 2 parameter of Integer type
import java.util.*;
interface test{
    void print(Integer p1, Integer p2);
}

public class multipleparameter {
    static void fun(test t, Integer p1, Integer p2){
        //calls the print function
        t.print(p1, p2);
    }
    public static void main(String[] args) {
        //lambda expressio is passed with two parameters
        //lambda expression is mapped to the double argument abstract function
        //in the functional interface test
        fun((p1,p2)->System.out.println(p1+" "+p2),10,20);
    }
}
