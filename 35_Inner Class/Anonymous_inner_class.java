// What is we want to change the behaviour of the class A

class A{
    public void show(){
        System.out.println("in A show");
    }
}

// this class will be used only once to extend A , not any use of creating a new class for just this purpose.
// class B extends A{
//     public void show(){
//         System.out.println("in A show");
//     }
// }
public class Anonymous_inner_class {
    public static void main(String[] args) {
        // A obj = new A();
         //  A obj = new B();
         
         // instead we provide implementation over here
         
         // inner class
         // this class as no name to it as it is inside the class, so it is called Anonymous class
         A obj = new A(){
            public void show(){
               System.out.println("in new show");
             }
         };
        obj.show();
    }
}
