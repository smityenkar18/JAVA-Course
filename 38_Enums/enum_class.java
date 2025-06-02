// only extending enum class is not possible , but rest all things like we can create methods, variables, is possible in enums

// enum in java extends enum

enum Laptop{
    Macbook(2000), XPS(2200), Surface(1500),ThinkPad(1800); // constants
    private int price;
    
    private Laptop(){
        price = 500;
    }
    
    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}

public class enum_class {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap + ":" + lap.getPrice());
        
        for(Laptop lapp: Laptop.values()){
            System.out.println(lapp + ":" +lapp.getPrice());
        }
    }
}
