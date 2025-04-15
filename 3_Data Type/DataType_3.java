

/* Data Type 

1 Byte = 8 bits

- Primitive (
Integer---> int (4 Bytes), byte (1 byte ) [-2^7 to 2^7 - 1], short (2 Bytes), int, long (8 bytes) , 
Float ----> double (8 bytes )[126.5678] (BY DEFAULT JAVA stores double ), float (4 bytes) [5.6f], 
Character --> 2 bytes JAVA follows UNICODE  c = 'k';, 
Boolean ----> true , false  )
             
              
 */

public class DataType_3 {
    
     public static void main(String[] args) {
        int num1 = 9;
        byte by = 127;
        short sh = 558;
        long l = 5854l;
        float marks = 65.56f;
        double d = 5.8;
        char c = 'k';            // literals
        
        boolean b = true;
      
        int num2 = 0x7E;          //hexadecimal value     
        
        System.out.println(num1);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(l);
        System.out.println(marks);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(num2);
        
        // literals
        
        int num3 = 10_00_00_000;
        System.out.println(num3);
        
        double num4 = 12e10; // very large number
        System.out.println(num4);
        
        // Character
        char ch = 'a';
        System.out.println(ch);
        ch++;
        System.err.println(ch);
    }

}

