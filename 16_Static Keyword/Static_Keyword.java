// Static Keyword - When we want a variable to be common for all, declare it as static.
// when we make 'name' variable as 'static', we are making it common to all the objects
// Static Variables are shared by different objects. 
// means making the variable as a class member not a object member.
// static name belongs to a class not to a object.

class Mobile{
    String brand;   // instance variable
    int price;      // instance variable
    static String name;    // declared as static variable
    
    public void show(){
        
        System.out.println(brand + " : " + price + " : " + name);
        
        // if we create a variable inside a method it is called Local Variable.
        // we can use Static variables in the non static methods like in this one .
    }
}

public class Static_Keyword {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "Smartphone";
        
        Mobile.name = "Phone";  // as we have declared name as 'static' , it is common to all objects, so it will be reflected for obj2 also.
        
        /* NOTE: 
         1. Static variables should be called with their class names , here in this case we should call with -> Mobile
         (we can call by the object names but , calling by class Name is preferred) -> should be called in a static way !
         
         */
        obj1.show();
        obj2.show();
        
    }
}
