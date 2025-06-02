class A{
    int age;
    public void show(){
        System.out.println("in Show");
    }
    
    static class B{
        public void config(){
            System.out.println("in Config");
        }
    }
}

public class inner {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        
       // A.B obj1 = obj.new B();  
                 
        // Why we done this ? -> we first need object of A , to create object of B as B is a inner class.
        
        //  if we dont need object we can call it directly , but make class static.
        
        A.B obj1 = new A.B();
        obj1.config();
    }
}

// The Outer class cannot be static.
