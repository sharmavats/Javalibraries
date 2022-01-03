//time complexity = o(n)
// space complexity =o(n)
import java.util.*;
public class balancedparenthesis {
    static boolean ismatching(char a , char b){
        if(a=='('&&b==')')
        return true;
        if(a=='{'&&b=='}')
        return true;
        if(a=='['&&b==']')
        return true;
        else
        return false;

    }

    static boolean validparenthesis(String str){
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);
            if(x=='('|| x=='{'|| x=='['){
              stack.push(x);
            }
            else{
                if(stack.isEmpty()== true)
                    return false;
                else if(ismatching(stack.peek(), x)==false)
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.isEmpty()==true;
    }
    public static void main(String[] args) {
        String str = "{(([]))}";
        System.out.println(validparenthesis(str));
    }
}
