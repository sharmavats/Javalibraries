import java.util.*;
public class stackimplementation{
    public static void main(String[] args) {
        //Stack<Integer> st = new Stack<>();
        ArrayDeque<Integer> st = new ArrayDeque<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());

    }
}