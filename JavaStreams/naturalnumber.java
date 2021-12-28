import java.util.*;
import java.util.stream.*;
public class naturalnumber {
    public static void main(String[] args) {
        Stream.iterate(1,x->x<100,x->x+2) //iterate(seed,hasnext,next)
        .filter(x->x.toString().contains("5"))
        .limit(20)
        .forEach(System.out::println);
    }
}
