class Laptop{
     int price;
     String model;
     
     public String toString(){
        return model + " : " + price;
     }
     
     public boolean equals(Laptop that){
        if(this.model.equals(that.model) && this.price == that.price)
            return true;
         else
            return false;   
     }
}

public class Object_class {
    public static void main(String[] args) {
        
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;
        
        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;
        
        boolean result = obj1.equals(obj2);
        
        System.out.println(result);  // in background it is calling toString() method
    }
}
