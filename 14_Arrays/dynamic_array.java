

public class dynamic_array {
    public static void main(String[] args) {
        
        int nums[] = new int[4]; // in square brackets mention the size of the array.
       
        // By default all values of these array would be 0.
        
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        
        // Using Loop
        for(int i=0; i<4;i++){
            System.out.println(nums[i]);
        }
    }
}
