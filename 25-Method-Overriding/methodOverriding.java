class A{
    public void show(){
        System.out.println("In A show !");
    }
    
    public void config(){
        System.out.println("In A Config");
    }
}

class B extends A{
     public void show(){
     System.out.println("In B show !");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}

/* Here while calling the show method via the object of B, we are Overriding the method show() in A class with that of B, so B class show is
   executed.
   
 */
