/* We cannot create object of Abstract Class, but can create a Reference of Abstract Class.  
 * Abstract method must have abstract class. 
 * Abstract class can have normal (implemented methods) , not necessary abstract methods also present, it may or may not be present.
 *  
 * if a inherited class cannot implement all the method of the abstarct class which are abstract, then that inherited class becomes abstract
 * then we need too create another class and then this class needs to inherit from the previous class as abstarct class object cannot be created.
 * 
 * so in our case as WagonR cannot create the fly method(), we make the class as abstract and created another class UpdatedWagonR which extends it.
 * 
 * The object of Concrete class can be created but not that of the abstract class. 
 * 
 * 
*/
abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("play music");
    }
}

abstract class WagnoR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}

class UpdatedWangonR extends WagnoR{                     // concrete class
    public void fly(){
        System.out.println("Flying...");
    }
}

public class abstract_keyword {
    public static void main(String[] args) {
        Car obj = new UpdatedWangonR();
        obj.drive();
        obj.playMusic();
    }
}
