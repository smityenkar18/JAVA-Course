class Mobile{
    String brand;   // instance variable
    int price;      // instance variable
    static String name;    // declared as static variable
    
    // This is a Instance Method or a Non Static Method
    public void show(){  
        System.out.println(brand + " : " + price + " : " + name);
    }
    
    // Creating a static method
    public static void show1(Mobile obj){
       System.out.println("In Static Method "); 
       System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
    
}

public class staticMethod {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "Smartphone";
        
        Mobile.name = "Phone"; 
        
        obj1.show();
        obj2.show();
        
        Mobile.show1(obj1);
    
        
        /*
         1. We cannot call a Non Static Method , with the Help of a class , like this :
          
          Mobile.show()   -> Not Possible !
          
         2. But we can call a Static Method ditrectly by using a class , like this :
         
          Mobile.show1()  -> Possible ! 
         
         3. We can use a Static variable inside a Static Method 
         
                    public static void show1(){
                      System.out.println(name); 
                    }
            
            *But we cannot use a Non static variable inside a Static Method , non static variable like brand and price cannot be used .
            
            Because: 
            Brand and Price would be different for Different Objects (As they are not Static, only Static Variable is common in between the Objects)
          
        4. We cannot use it directly but we can do it Indirectly. (by Pass the Object) meaning -> By Object Reference
        
                     public static void show1(obj1)
                     {
                      System.out.println(name); 
                     }
                      
                     *and also accept it in the Static Method
                     
                     public static void show1(Mobile obj){
                      System.out.println(obj.brand + " : " + obj.price + " : " + name); 
                      }
                      
         */
        
    }
}

/*
 Why main() is static ?
 - if we do not declare main() as static , it will be a non static method, which means we first need to create the object of class staticMethod 
 but how can we make object of the staticMethod class ?
 - by using static we are saying , that to call main we dont need object of  staticMethod class  (thus static method is not common to any object.)
 */
