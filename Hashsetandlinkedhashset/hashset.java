import java.util.*;
public class hashset {
   public static void main(String[] args) {
     Set<String> s = new HashSet<String>();
     s.add("hello");  
     s.add("my");  
     s.add("name");  
     s.add("is");  
     s.add("kamal");  
     s.add("sharma");
     System.out.println(s.contains("kamal"));
     Iterator<String> it = s.iterator();
     while(it.hasNext()){
         System.out.print(" "+ it.next());
     }  
   } 
}
