import java.util.*;
import java.lang.*;
class point{
    int x,y;
    point(int x, int y){
        this.x=x;
        this.y=y;
    }
 // This method is used to return the 
    // string version of the point
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
} 
class cmp implements Comparator<point>{

    @Override
    public int compare(point p1, point p2) {
        // TODO Auto-generated method stub
        return p1.x-p2.x;
    }

}
public class Comparatorimplementation {
    public static void main(String[] args) {
        point arr[] = {
            new point(10, 20), 
            new point(5, 45), 
            new point(25, 35) };
            
        // Sorting the object containing the array 
        // by passing the array and object MyCmp
        Arrays.sort(arr, new cmp());
        
        // Displaying the sorted points
            System.out.println(Arrays.toString(arr));
    }
}
