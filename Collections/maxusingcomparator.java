import java.util.*;
class Point{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
 class Mycmp implements Comparator<Point>{

    @Override
    public int compare(Point p1, Point p2) {
        return p1.x-p2.x;
    }
    
}
public class maxusingcomparator {
    public static void main(String[] args) {
        // creating object of LinkedList 
        List<Point> list = new ArrayList<Point>(); 

        // Adding element to list
        list.add(new Point(5, 20));
        list.add(new Point(25, 10));
        list.add(new Point(10, 40));
        
        // To get the maximum elements
        Point p = Collections.max(list, new Mycmp());
        System.out.println(p.x+" "+p.y);
    }
}
