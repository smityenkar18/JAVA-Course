import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class reduce_in_stream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        
        // Reduce takes 2 parameters, 1  is the type, and other is the operation -> BinaryOperator  
        
        
        int result = nums.stream()
                            //.filter(p)
                          //  .map(fun)
                            .reduce(0, (c,e) -> c+e);
                            
                         // when we want to add the numbers ex: 0 1 2 3 4
                        // we add 2 numbers first lets say 0 and 1 0+1 = 1, then 1 and 2, 1+2 = 3, then 3 and 4 and so on..
                       // in the reduce the 0 is the initial value |  c and e is the variable which we are using to add | c+e is the operation
                       
        Stream<Integer> sortedValues = nums.stream()
                                           .filter(n -> n % 2 ==0)
                                           .sorted();               
        
        // System.out.println(result); 
        sortedValues.forEach(n -> System.out.println(n)); 
    }


 
}
