import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sorting {
    public static void main(String[] args) {
        
        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                
                if(i%10 > j%10)                // by checking the last number, | we get last numbee by using mod 10
                  return 1;
                else
                 return -1;
            }
        };
        List<Integer> nums = new ArrayList<>(); // no need of specifying the type in RHS
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
        
        Collections.sort(nums);
        System.out.println(nums);
        
        // if we want to sort based on our logic | We can use the Comparator
        // our logic here is sort the numbers based on there last digit
        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
