import java.util.*;
class Point implements Comparable<Point>{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;

    }
    @Override
    public int compareTo(Point p) {
        // TODO Auto-generated method stub
        return this.x-p.x;
    }
    
}

public class maxuserdefined {
    public static void main(String[] args) {
        List<Point> l = new ArrayList<Point>();
        l.add(new Point(12,16) );
        l.add(new Point(17,14) );
        l.add(new Point(25,28) );
        l.add(new Point(10,83) );

        Point p = Collections.max(l);
        System.out.println(p.x + " " + p.y); 
    }
}
