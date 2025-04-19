class Calculator{
    
  //int a;
    
  public int add(int num1, int num2){                  // declared public so that it can be called from anywhere
    // System.out.println(" in add");
    int r = num1 + num2;
    return r;
  }
}
public class Class2 {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        
        Calculator calc = new Calculator();        // calc is of type Calculator , we normalyy call them as reference variable.
                                                   // by new Calculator() we are creating a new Object 
        int result = calc.add(num1,num2);
        System.out.println(result);
    }
}
