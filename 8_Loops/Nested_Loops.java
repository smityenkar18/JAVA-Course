//package 8_Loops;

public class Nested_Loops {
    public static void main(String[] args) {
        System.out.println("WHILE LOOPS");
        
        int i =1;
        
        while(i<=5)
        {
        System.out.println("Hi"+i);
        int j=1;
        while(j<=3){
            System.out.println("Hello");
            j++;
        }
        
        i++;
        }
        System.out.println("Bye "+ i);
    }
}
