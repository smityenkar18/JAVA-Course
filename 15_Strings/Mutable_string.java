// String Buffer or a String Builder.

// String Buffer is thread safe 
// String Builder is not thread safe

public class Mutable_string {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Smit"); // gives us a buffer of 16 bytes.
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Yenkar");
        System.out.println(sb);
        
        sb.deleteCharAt(2);
        sb.insert(2, "i");
        sb.substring(10);
        sb.ensureCapacity(100);
        
        
        // convert to string
        String str = sb.toString();
        System.out.println(str);
    }
}         
