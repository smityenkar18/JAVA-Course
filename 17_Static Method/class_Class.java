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

public class class_Class {
    public static void main(String[] args) throws ClassNotFoundException {
     Class.forName("Mobile");  // instatiate the object.
    }
}
