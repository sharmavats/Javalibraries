import java.util.*;
interface Test1{
    void print();
}

public class Lamdanoparameter {
    //functional interface without parameters
    static void fun(Test1 t){// instance of test1
    t.print();
    }
    public static void main(String[] args) {
        //lambda expression is passed 
        // without parameter to functional interface
        fun(()->System.out.println("Hello")); 
    }
}
