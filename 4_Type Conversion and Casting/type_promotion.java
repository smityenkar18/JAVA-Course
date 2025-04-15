public class type_promotion {
    public static void main(String[] args) {
      
        byte a = 10;
        byte b = 30;
        
        //Type Promotion
        int result = a * b;  // byte  * byte = byte , but here it goes out of range, so Java promotes it to Integer
        System.out.println(result);
    }
}
