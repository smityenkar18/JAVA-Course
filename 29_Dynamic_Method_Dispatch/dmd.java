/* 
           -- A --
           |     |
           B     C
           
 */

 /*
   class Computer{
    
   }
   
  class Laptop extends Computer{
    
   }
  
   Laptop lap = new Laptop();
   Same thing we are doing here. Creating a reference of Computer and an object of Laptop
   we are refering that as a computer.
   so we can mention the type as parent and the object can be of child.
   
   Computer obj1 = new Laptop();
   
  */

 
class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show ");
    }
}

class C extends A {
    
     public void show(){
        System.out.println("In C show");
    }
}

public class dmd {
  public static void main(String[] args) {
   /* 
    B obj = new B();
    
    Creating a Refernce of A and an object of B.
    as B extends A, B is a child of A, here type of (obj) is A, but implementation is B
    
    A obj = new B();
    obj.show();
    
    */ 
    
   A obj = new A();
   obj.show();
   // we can assign a new object to the old variable.
   obj = new B();
   obj.show();
   
   obj = new C();
   obj.show();
   
   // Different object will have different behaviour (Run time Polymorphism)
   // obj.show() is behaving differenty with different objects ie. polymorphism
   // at compiling we dont know , which method of which class will the obj.show() will call.it will be decided at run time ie. Run Time Polymorphism
   // And all this concept is called Dynamic Method Dispatch.- this only works when we have inheritance.
  }
}
