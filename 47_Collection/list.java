import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6); 
        nums.add(5); 
        nums.add(7); 
        nums.add(8);
        
        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(5));
        
        // List supports repeated values
         for(Object n: nums){
            int num = (Integer)n;    // typecasting
            System.out.println(num*2);
         }
        }
    }

