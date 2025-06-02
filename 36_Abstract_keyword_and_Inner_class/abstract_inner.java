abstract class A{
    public abstract void show();
    public abstract void config();
}
// class B extends A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }

// entire purpose of the B is to get extended and then implement show method, if we are using it only once , why to create a new class.

// so we used inner class, to provide the implementation (Annonymous Inner class )
public class abstract_inner {
    public static void main(String[] args) {
       // A obj = new B();
       
       A obj = new A(){
        public void show(){
        System.out.println("in B show");
      }
      
      public void config(){
        System.out.println("in B show");
      }
      
      // we can provide implementation for multiple methods
      
     };
        obj.show();
    }
}
