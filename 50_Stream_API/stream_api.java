// Stream is an interface | It returns the object of Stream
// Benefits of Stream -> Provide various methods
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_api {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        
        Stream<Integer> s1 = nums.stream();
        // All the values  in the Stream are avaiable in the s1
        
          // methods in stream
        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);            // This is New Stream s2. [Has only Even Numbers]
        // Filter is filtering the value based on Even or Odd
        
        Stream<Integer> s3 = s2.map(n -> n*2);                   // in this stream we are Doubling the value
        
        // s1.forEach(n -> System.out.println(n));
        
        s3.forEach(n -> System.out.println(n));
        // Once we used the stream we cannot resuse it
        
        int result = s3.reduce(0, (c,e) -> c+e);
        System.out.println(result);
        
        /* This all can be further reduced 
           
           int result = nums.Stream()
                            .filter( n -> n%2 == 0)
                            .map(n -> n*2)
                            .reduce(0, (c,e) -> c+e);
            
            On stream we are applying a filter, then a map, and then reduce                
         */
    }
}
