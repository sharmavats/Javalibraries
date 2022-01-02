/*
There are N people standing in a circle numbered from 0 to N-1 waiting to be executed. 
The counting out begins at some point in the circle and proceeds around the circle in a fixed direction. 
In each step, a certain number of people are skipped and the next person is executed. 
The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed),
 until only the last person remains, who is given freedom. Given the total number of person N and a number K which
  indicates that K-1 persons are skipped and Kth person is killed in the circle, after killing the K-th person,
   the executed person is removed and the next iteration begins from the next position.
    The task is to find the position of the last person who manages to survive.
*/
import java.util.*;
public class Josephus {
    static int Josephusproblem(int N, int K){
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0; i<N; i++){
            list.add(i);
        }
        Iterator<Integer> it = list.iterator();
        // Run this loop until there is only 
        // one element left in the list
        while(list.size()>1)
        {
            int count = 1;
            
            // Find Kth element
            while(count< K)
            {
                while(it.hasNext() && count <= K)
                {
                    it.next();
                    count++;
                }
                
                // If this is true, it means we have reached
                // end of list and count is less than k
                // So, we will move iterator from end to first
                // and increment count
                if(count < K)
                {
                    it = list.iterator();
                    it.next();
                    count++;
                }
                
                // Remove the Kth element
                it.remove();
            }
        }
        return list.getFirst();
    }
    public static void main(String[] args) {
        int N = 7, K = 3;
        
        System.out.println(Josephusproblem(N, K));
        
        
    }
}
