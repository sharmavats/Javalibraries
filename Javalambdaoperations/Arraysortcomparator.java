// Java code to sort the array according to x-coordinates
import java.util.*;
//point class which does not implement comparable interface
//thus the objects of this class are comparable
class Point{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Arraysortcomparator {
    public static void main(String[] args) {
        //arrays of point types
       Point arr[] = {new Point(10,20),new Point(5,30),new Point(30,40)};
       //Arrays.sort() is called and the array passed
       //alongside lambda expression 
       //the lambda expression implements compare() method of Comparable interface

       Arrays.sort(arr,(p1,p2)->p1.x-p2.y);
       for(int i=0; i<arr.length; i++){
           System.out.println(arr[i].x+" "+arr[i].y);
       }
    }
}
