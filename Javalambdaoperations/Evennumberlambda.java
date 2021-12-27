import java.util.*;
import java.util.function.Predicate;
public class Evennumberlambda {
static void printcond(Collection<Integer> c, Predicate<Integer> p){
    //Traverse the collection and print only those elements that pass the test
    for(Integer x: c){
        if(p.test(x)){
            System.out.print(x+" ");
        }
    }
}
    public static void main(String[] args) {
        //arraylist to check the function
        List<Integer> a1 = new ArrayList<>(Arrays.asList(10,5,20,7,30));
    // Passes the collection and a 
        // lambda expression which is a functional
        // interface
        // This lambda expression maps the test
        // function of abstract method
        printcond(a1, x->x%2==0);
    
    }
}
