import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

// In SET WE CANNOT HAVE REPEATED VALUE (ONLY UNIQUE VALUES)

// THE CLASS WHICH IMPLEMENTS SET IS HashSet
// ALSO no sorted order for set
// set doenst support index values.

public class set_HashSet {
    public static void main(String[] args) {
        
        // Set<Integer> nums = new HashSet<Integer>();   // generic type integer
        // nums.add(6); 
        // nums.add(5); 
        // nums.add(7); 
        // nums.add(8);
        // nums.add(6);
        
        // for(int n: nums){
        //     System.out.println(n);
        // }
        
        // if we want a sorted value , we can use TreeSet
        // in palce of Set we can use Collection as well
        
        Collection<Integer> nums = new TreeSet<Integer>();   // generic type integer
        nums.add(6); 
        nums.add(5); 
        nums.add(7); 
        nums.add(8);
        nums.add(6);
        
        // on the top of Collection we have an interface called Iterable
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext())
            System.out.println(values.next());

            // for(int n1: nums){
        //     System.out.println(n1);
        // }
        }
    }

