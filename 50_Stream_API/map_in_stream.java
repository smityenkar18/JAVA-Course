import java.util.Arrays;
import java.util.List;
import java.util.function.Function; 

public class map_in_stream {
    public static void main(String[] args) {
         List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        
        // Map needs an object of a Function
        // What is Function ? -> Function is an Functional Interface which has 2 arguments (T,R) | the functional argument, the functional result
        // means it takes 2 arguments , the one it accepts, and the other it returns
        
        
        Function<Integer,Integer> fun =  n -> n * 2;       // our Logic here is to double the n
            
        // usingLambada expression for this
        
        /* without lambda expression  
        
            Function<Integer,Integer> fun = new Function<Integer,Integer>(){

            public Integer apply(Integer n) {
                
               return n * 2;       // our Logic here is to double the n
            }
            
        };
           
         */
        int result = nums.stream()
                            //.filter(p)
                            .map(fun)
                            .reduce(0, (c,e) -> c+e);
        
        System.out.println(result);    
    }
}
