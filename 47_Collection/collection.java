// API is basically a library or a feature which we can simply use.
import java.util.ArrayList;
import java.util.Collection;


// collection is the interface, so we cannot create an object of it.
// There are certain more interfaces which actually extends the Collection0 Interface (Like List,Queue, Set)
// And Individually these Interfaces have there won Class implementation .
// Collection API which is a concept has Map

// If we just want values use-> ArrayList
// If we want index values too then use -> List 

/*
Collection-|: List---> ArrayList , LinkedList
           |: Queue--> DeQueue
           |: Set----> HashSet, Linked HashSet
           
*On the top of Collection we have another Interface called Iterable.

*/    
public class collection {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList();
        nums.add(6); 
        nums.add(5); 
        nums.add(7); 
        nums.add(8);
        
        // we cannot directly print an array , we need Loop for it, but for Collections we can direclty print it
        // Collection Normally work with Objects, not a primitive value.  
        // so in angular bracket <> we specify the type of element ex: Integer (which is a wrapper class for primitive)  
        for(int n1:  nums){
        System.out.println(n1);
        
        for(Object n: nums){
            int num = (Integer)n;    // typecasting
            System.out.println(num*2);
         }
        }
    }
}
