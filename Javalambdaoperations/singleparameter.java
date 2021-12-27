//java code to illustrate lamda expression with single parameter
import java.util.*;
interface Test{
    void print(Integer p);
}
public class singleparameter {
    static void fun(Test t, Integer p){
        //calls the print function
        t.print(p);
    }
    public static void main(String[] args) {
        fun(p->System.out.println(p),10);
    }
}
