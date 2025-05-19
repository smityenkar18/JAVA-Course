

public class Operators {
    public static void main(String[] args) {
        
        int num1 = 7;
        int num2 = 5;
        int result1 = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1 / num2;
        int result5 = num1 % num2;
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        
        // num1 = num1 + 2;
        // System.out.println(num1);
        //num1 +=2;
        
       // num1 +=1;
       //  num1++;                     // increment
        
       // ++num1;      // Pre - Increment (Although it is incrementing the value like Post Increment ,it behaves differently while assigning /Fetching    the value) 
        
       //int result = ++num1;          (Pre-Increment) -> *Fist increment then Fetch the value
       //System.out.println(result);  // result -> 8
       
       int result = num1++;            //(Post-Increment) -> *First it will fetch the value of num and then increment
       System.out.println(result);      // Result -> 7
       System.out.println(num1);
         
    }
}
