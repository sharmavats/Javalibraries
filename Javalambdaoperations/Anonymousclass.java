//  In anonymous classes, no extra class name is needed and no objects are needed to be passed, instead, an instance is passed. This makes the code concise.
import java.util.*;
import java.util.function.Predicate;
public class Anonymousclass {
    static void printCond( Collection<Integer> c, Predicate<Integer> p){
        for(Integer x:c){
            if(p.test(x))
            System.out.println(x+" ");
        }
    }
    public static void main(String[] args) {
         // An instance of Predicate type is created
        // Creating anonymous class with Predicate interface
        Predicate<Integer> MyPredEven = new Predicate<Integer>(){
            public boolean test(Integer x){
                return(x%2==0);
            }
        };

        //ArrayList to check the function
        List<Integer> al = new ArrayList<>(Arrays.asList(10,5,20,7,30));
        // Passing the collection ArrayList 
        // and an object of MyPredicateEven class
        // Since the class MyPredicateEven implements
        // Predicate interface it can be passed as an object
        // to be assigned to a variable p of Predicate type
        printCond(al, MyPredEven);
    }
}
