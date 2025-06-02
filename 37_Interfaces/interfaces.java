abstract class Computer{
     public abstract void code();
}

class Laptop extends Computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();                       // when we call the code(), it will be called on the basis of the what object we are passing
        // we are passing a computer reference (desk) and we are getting a computer reference
        // we are passing desktop object.
        //once we have passed the laptop object we can call the  code method   
    }
}

public class interfaces {
    public static void main(String[] args) {
        
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer smit = new Developer();
        smit.devApp(desk);
        
    }
} 

/* Same code can be used for interfaces . Just replace extends with Implements and abstract class with interface*/
