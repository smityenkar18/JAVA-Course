
public class type_conversion {
    public static void main(String[] args) {
      
        byte b = 127;
        int a  = 256;
        System.out.println(a);
        a = b;                // this will work , but b = a will not work. (range of int is big)
        
        // CASTING
        b = (byte)a;    
            // converting integer to byte (explicit)
        float f = 5.6f;
        int x = (int) f;    // converting float to int
        System.out.println(b);
        System.out.println(f);
        System.out.println(a);
        System.out.println(x);
        System.out.println(a);
    }
}
