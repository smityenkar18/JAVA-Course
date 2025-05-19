

public class Multidimensional_Array {
    public static void main(String[] args) {
    //                 3 Rows & 4 Columns OR 3 rows and each row has an array of size 4.      
        int nums[][] = new int[3][4];
        
        // To Fetch Random Values
       // type casting (double value in int)
        
        
        // Using Loop
        // FETCH -using Random Value
        for(int i =0; i<3; i++){
            for(int j=0;j<4;j++){
                nums[i][j] = (int)(Math.random() * 100);
                
            }                      
        }
        
        // DISPLAY
        for(int i =0; i<3; i++){
            for(int j=0;j<4;j++){
               System.out.print(nums[i][j] + " ");
                
            }      
            System.out.println();                
        }
        
        for(int n[]: nums){
            for(int m: n){
                System.out.println(m + " ");
            }
            System.out.println();
        } // Enhanced For Loop
    }
}
