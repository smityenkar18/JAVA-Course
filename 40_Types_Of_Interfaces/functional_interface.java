
//This is SAM , Functional Interface

@FunctionalInterface
interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
// }
// using anonymous inner class

public class functional_interface {
    public static void main(String[] args) {
       // A obj = new ();
        A obj = new A(){
            public void show(){
                System.out.println("in show");
            }
        };
        obj.show();
    }
}
