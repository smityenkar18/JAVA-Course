public class Nested_For_Loop {
    public static void main(String[] args) {
        for(int i=0;i<=7; i++){
            System.out.println("DAY "+ i );
            
            for(int j=1; j<=9; j++){
                System.out.println(" " + (j+8)+ " - "+ (j+9));         // calendar for marking tasks.
            }
        }
    }
}
