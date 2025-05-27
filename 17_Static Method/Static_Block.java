// Static Block is used to Initialise a Static Variable. 
class Mobile{
    String brand;   // instance variable
    int price;      // instance variable
    static String name;    
    
    static{
        name = "Phone";
        System.out.println("Inside the Static Block");
    }
    
    // if we want to initialise the instance variable we can use a Constructor
    public Mobile(){
        brand = "";
        price = 200;
        // name = "Phone";  we can initialise the static variable inside a constructor
        System.out.println("Inside the Constructor ");
    }
    
    /* NOTE:
    1. every time we call the constructor we are initialising the static variable , we dont want to do that. so for this we have a special block called the Static Block
    2. Static block would be called once.
    
    */ 
    
    
    
    public void show(){
        
        System.out.println(brand + " : " + price + " : " + name);
        
    }
}

public class Static_Block {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";
        obj1.show();
        Mobile obj2 = new Mobile(); 
        obj2.show();
        
        // we will call the constructor 2 times because (2 objects ), but the Static Block is called for 1 time. 
        // 'static block' or static method is called first then the Constructor.
        // Why ? -> Read -> INFO (down)
    }
}

/** INFO: 
 * 
 * Class Loader: Every class is loaded in a class Loader, -> it has every class which is loaded
 * IN JVM we have a special area called Class Loader. 
 * when it sees the first line ' Mobile obj1 = new Mobile();', it loads the class, then the object is created.
 * Every time we load a class , it calls the 'Static Block' -> As Class Loading occurs first , so static block is loaded first.then it will create      the object , so then it will call the constructor.
 * 
 * 
 * If we dont create a object , then no class would be loaded , For this we have a class called - Class
 */