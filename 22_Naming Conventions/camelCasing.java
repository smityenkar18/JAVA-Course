/* Camel Casing
 * class and interface - Calc, Runable
 * variable and method - marks, show()
 * constants - PIE, BRAND
 * 
 * showMyMarks()
 */
class A{
    public void show(){
        System.out.println("in A show");
    }
    public A(){
        System.out.println(" Object Created");
    }
}
public class camelCasing {
    public static void main(String[] args) {
        /*
        A obj = new A();
        obj.show();                               // obj is a REFERENCE Variable (because it is referring to an object )
        */
        
        new A().show();
        /*  new A(); -> this type of object is called Anonymous object, because this type of object dont have name
         *This anonymous objects cannot be re-used again
          Every time we say new A(), it creates a new object()
         */
           
    }
}

/* 
   A obj;               // Declaration of object  (Reference Creation)
   obj = new A();      //  Now Assigning the value to obj, 
   
   * new A() means creating the object, (Object Creation) | Creating inside Heap Memory
   
   obj.show();   
 */
