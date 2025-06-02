/* THIS Method
 * ( this Method ) -> when used calls the constructor of the current class first,
 * then that class will call the constructor of the super class because of the super() keyword.
 * then one by one each code in constructor will be executed.
 */

class A extends Object                                // Super Class
{
    public A(){
        super();
        System.out.println("in A");
    }
    
    public A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A                         // Sub Class
{
    public char[] marks;

    public B(){
        super();
        System.out.println("In B");
    }
    
    public B(int n){
        this();
        System.out.println("in B int");
    }
}

public class This {
    public static void main(String[] args) {
        B obj = new B(5); // creating object of B, we are instantiating it. 
        // calling the parameterized constructor
        System.out.println(obj);
    }
}
