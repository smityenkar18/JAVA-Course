// Most of the time we use Interface in project Development

/*
 * Every Method in the Interface are by default -> public abstract
 
 * So Interface means - Its like a class in which all methods are by default public abstract()
 * We create Interface so that we can design something.
 * we cannot instantiate the object of an Interface
 * 
 * Interface tells us what are the method to be implemented, but not implement it by its own.
 * 
 * Ulitmately we create object of a class, Interface just show us the design. 
 * 
 * if we didnt define the methods in the interface in a class which implements it, then the class also becomes an abstract class. 
 * 
 * Interface Dont have their own memory in the Heap     
 * 
 */

 interface A{
    
    int age = 44;         
    String area = "Mumbai";
    
    // we can create variables in interface but all variables are by default final and static in an Interface
    // final means we need to intitialze the variable.
    // they are static means - we can directly use the interface name. (Like when we used the static keyword we dont use the object, we call using Class name)
    
    void show();      
    void config(); 
 }
 
 class B implements A{            
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
 }
 
 // we can't create object of A as it is an interface, but we can now create an object of B
public class Interface_3 {
    public static void main(String[] args) {
        // A obj;
        //      obj = new A();
        
         A obj;
         obj = new B();
         obj.show();
         obj.config();
         
        
        System.out.println(A.area); 
        System.out.println(A.age);
        
        // A.area = "Hyderabad";      not possible as variables in interface are final
         
    }
}
