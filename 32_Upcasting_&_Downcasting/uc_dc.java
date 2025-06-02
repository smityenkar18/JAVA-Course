class A{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}

public class uc_dc {
    public static void main(String[] args) {
   
        
        double d = 4.5;
        int i = (int) d;     // typecasting
        System.out.println(d);
        
        A obj = (A) new B();   // typecasting with parent class (Upcasting) -object is B, we are trying to refer A (to superclass)
        obj.show1();
    
        B obj1 = (B) obj;      // (Downcasting  )
        obj1.show2();
        
    }
}
