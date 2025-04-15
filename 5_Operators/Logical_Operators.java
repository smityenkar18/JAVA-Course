public class Logical_Operators {
    public static void main(String[] args) {
        System.out.println("Logical Operators & AND | OR ! NOT ");
        
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;
        
        boolean result = x >y && a >b;
        
        System.out.println(result);
        result = x >y || a >b;
        System.out.println(result);
        result = a>b;
        System.out.println(!result);
        
    }
}
