/* SUPER
 * Every Constructor in Java has a method , which is present, even if we dont mention, & that method is super().
 
 super() means -> Call the Constructor of Super Class. if written in this way -> super(), it will call the Parameterized Constructor 
 of Super class.
 
 * After Executing the part in the constructor of super class it will execute the remaining code in the sub class constructor.
 
 * If we did this -> super(5) this will call the Parameterized constructor of super class.
 * 
 */
//---------------------------------------------------------------------------------------------------------------------------------------
 /* OBJECT CLASS
  * Every Class in Java Extends the  ( Object Class ), which is present, even if we dont mention it.
  * we have super() in the SUPER CLASS, we are calling the constructor of the object class
  
  * B class doesnt extends Object, B extends A, A extends Object, [it is Multi-Level Inheritance].
  */
  
class A extends Object                                // Super Class
{
    public A(){
        super();
        System.out.println("in A");
    }
    
    public A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A                         // Sub Class
{
    public B(){
        super();
        System.out.println("In B");
    }
    
    public B(int n){
        super(n);
        System.out.println("in B int");
    }
}
public class this_super {
    public static void main(String[] args) {
        B obj = new B(5); // creating object of B, we are instantiating it. 
        // calling the parameterized constructor
        
        
    }
}
