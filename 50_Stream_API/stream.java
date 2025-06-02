// Stream APi
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class stream {
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<>();
        // nums.add(4);
        
        // instead of this we have a way, we have a class called Arrays
        
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        //operation
        // int sum=0;
        // for(int n: nums){
        //     if(n%2 == 0){
        //         n = n*2;
        //         sum= sum + n;
        //     }
        // }
        // System.out.println(sum);
        
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                
                System.out.println(n);  
            }
            // above code in Lambada Expression: Consumer<Integer> con = n -> System.out.println(n)
        };
           //  nums.forEach(n -> System.out.println(n));
        
           // Now we can do direclty too, no need of creating a Reference for Consumer | nums.forEach(n -> System.out.println(n));
           
           nums.forEach(con);       
    }
}
