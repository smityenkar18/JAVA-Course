

public class wrapper {
    public static void main(String[] args) {
        int num= 7;
        /*  now how can we store this in a class type or object type.
            we are taking an primitive value and storing it in Wrapper Object or Class Object. 
         
        Integer num1 = new Integer(num);   
        
        This is called Boxing. */ 
        // This can be done directly now !
        
        Integer num1 = num;                  // AutoBoxing (Conerting to Object automatically)
        
        /*  if we want toa assign the value to some other variable
        
            int num2 = num1.intValue();          // This is Unboxing (Getting value from Object type to primtive type )
        */
        
        // this also can be done automatically 
         
        int num2 = num1;                       // Auto-Unboxing (Automatically getting value from object type to primitive type)   
        
        System.out.println(num1);
        System.out.println(num2);
        
        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2); // now we can perform this operation
        
    }
}
