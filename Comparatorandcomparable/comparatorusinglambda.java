import java.util.*;
class point{
    int x,y;
    point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
    return "(" + x +","+ y+ ")";
    }
}
public class comparatorusinglambda {
    public static void main(String[] args) {
        point arr[] = {new point(24,37),new point(22, 26), new point(30,24)};
        Arrays.sort(arr,(p1,p2)->(p1.x-p2.x)); 
        System.out.println(Arrays.toString(arr));
    }
}
