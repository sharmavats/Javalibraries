import java.util.*;
public class Reverseorder {
    static void reverse(List<Integer> list){
        Stack<Integer> st = new Stack<>();
        for (Integer x : list) {
            st.push(x);
        }
        for(int i=0; i<list.size(); i++){
            list.set(i, st.pop());
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        reverse(list);
        System.out.println(list);
    }
    
}
