/*
 Method OverLoading
   
 *Add 2 Numbers
 
 -> public int add(int n1, int n2){
        return n1 + n2;
    } 
 
 *If we want to add 3 numbers we need to do    
 
 -> public int add(int n1, int n2,int n3){
        return n1 + n2 + n3;
    } 
   
 *But if we again want to add 2 numbers then ? -> we can add more methods like this :
  ->>  public int add1(int n1, int n2,int n3){
        return n1 + n2 + n3;
       }
     }

    *Problem: When we have more methods , we need to maintain the documentation for it.
     
    so we want same method names,(only thing changing is Parameters), we can have it with same names, just we need to have different paramaters, or must have different type (data type ) of parameters
    
    
 */

class Calculator{
    
  //  int num3; // is Instance Variable
    
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

// METHOD OVERLOADING: Different number of parameters or different type of parameters | This Concept in Java is called Method Overloading.

public class method_overloading {
    public static void main(String[] args) {
        System.out.println("Static Keyword ! ");
        
        Calculator calculator = new Calculator();
        int result = calculator.add(4, 5);
        System.out.println(result);
    }
}


// Methods having same name but different number of parameter or different types of parameters
