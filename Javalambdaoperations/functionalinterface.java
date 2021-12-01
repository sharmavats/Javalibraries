import java.util.*;
import java.util.function.Predicate;
public class functionalinterface{
    static void printcond( Collection<Integer> c, Predicate<Integer> p){
        //Traverse the collection print only those elements which pass the test 
    for(Integer x:c){
        if(p.test(x))
        System.out.print(x+" ");
    }
    }
    public static void main(String[] args) {
        //This class implements predicate interface 
        class MyPredicateEven implements Predicate<Integer>{
            public boolean test(Integer x){
                return (x%2==0);
            }
        }
        //Arraylist to check the function
        List<Integer> al = new ArrayList<>(Arrays.asList(10,5,20,7,30));

         // Passing the collection ArrayList 
        // and an object of MyPredicateEven class
        // Since the class MyPredicateEven implements
        // Predicate interface it can be passed as an object
        // to be assigned to a variable p of Predicate type

        printcond(al, new MyPredicateEven());
    }
}