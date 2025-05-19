/*
 * Each Method has its own Stack
 * 
 * example: 
 * we have main stack: 
   Stack has:
   _______________________ 
   |calculator   | 101   |  -> this is a refernce variable written in main method
   |result       |  9    |  
   | data        |  10   |
   |             |       |
 *   Key         &  Value
 * 
 * We have result variable , it will be in the stack, but we dont have add method, so it will Create a new STACK out of it !
 * 
 * _________________ 
   | n2    |   5   | 
   | n1    |   4   |
   |       |       |
   then execute the add method, then the value will be returned to result
   
  ______
  |HEAP| 
  * When we create a new Object ->  new Calculator() , then it will simply create a new Object in The HEAP MEMORY
  * It has 2 sections -> First section will have all the Instance Variables(not local variable, because local variable are part of stack)
  *                    -> It will also have the method Declarations related to the object, it will only have defintions, actual area    which method would consume would be of stack.
  * This Object will also have its own address. -> And this will be stored in the STACK (example say address : 101)
   
  HEAP MEMORY
|=======================|
|         101           |
|   _________________   |
|   | num =5        |   | 
|   |_______________|   |
|   |      add()    |   |
|   |               |   |
|                       |
|=======================| 


* ACTUAL EXECUTION STARTS FROM STACK

 |-------------------------------|
 |                           JVM |
 | |--------------------------|  |
 | |  STACK                   |  |
 | |                     HEAP |  |
 | |  MAIN STACK              |  |
 | |--------------------------|  |
 |-------------------------------|
 
 We can create as many objects in HEAP
   */

class Calculator{
    
    int num=5; // is Instance Variable
    
    public int add(int n1, int n2,int n3){
        
        return n1 + n2+n3;
        
        // n1 , n2 , n3 are local varaibles
    }
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public double add(double n1, int n2){
        return n1 + n2;
    }
    
    
}


public class Local_and_instance {
    public static void main(String[] args) {
        
        int data = 10;                            // local Variable
        System.out.println("Static Keyword ! ");
        
        Calculator calculator = new Calculator();
        Calculator calculator1 = new Calculator();
        int result = calculator.add(4, 5);
        System.out.println(result);
        
        calculator1.num =8;                    // changing the value 1 object not of calculator , only of calculator1
        
        System.out.println(calculator.num);  // o/p -> 5
        System.out.println(calculator1.num); // o/p -> 8 
        // becuase there are 2 different Objects
    }
}

