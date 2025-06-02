import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class filter_in_stream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        
        // filter needs an object of a Predicate
        // What is Predicate ? -> Predicate is an Interface which has method called test of type boolean (means it can be either true or false).
        
        Predicate<Integer> p = new Predicate<Integer>(){

            @Override
            public boolean test(Integer n) {
                if(n % 2 == 0)
                   return true;
                else   
                   return false;
            }
            
        };
        
    // filter will be working | Filter needs the object of Predicate which specifies the Logic of when to pass the value and when stop the value
        int result = nums.stream()
                            .filter(p)
                            .map(n -> n*2)
                            .reduce(0, (c,e) -> c+e);
        
        System.out.println(result);                    
       
    }
}

// Since Predicate is an Functional Interface we can use Lambada Expressions

/* 
   Predicate<Integer> p = n -> n%2 == 0; 
 
   
   *when we have only 1 parameter we can remove the braces.
 */
