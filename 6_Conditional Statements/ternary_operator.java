//package 6_Conditional Statements;

public class ternary_operator {
    public static void main(String[] args) {
        int n = 9;
        int result;
        // if(n%2 == 0){
        //     result = 10;    
        // }
        // else{
        //     result =20;
        // }
        
        // TERNARY OPERATOR  ->  ?:
        
        result = n%2==0 ? 10:20; // if  n%2==0 is true return 10, if it is false return 20
        
        System.out.println(result);
        
    }
}
