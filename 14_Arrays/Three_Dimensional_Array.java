public class Three_Dimensional_Array {
    public static void main(String[] args) {
        System.out.println("Three Dimensional Array");
        
        int nums[][][] = new int[3][4][5];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length;j++){
                for(int k=0;k<nums[j].length; k++){
                nums[i][j][k] = (int)(Math.random()*100);
                }
            }
        }      
    }
}
