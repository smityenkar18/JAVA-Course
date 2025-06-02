/* Access Modifier -> Public, Private, Protected , Default 
 * Private entities can be accesses from the same class, class B being in the same package as that of main , still private variables cannot be used
 * Private Variables can be used within the same class, irrespective of the Package .abstract 
 * 
 * Public can be used from anywhere !
 * 
 * DEFAULT - means it can be accesed in the same Package, same package subclass, same package's non-subclass.
 * 
 * PROTECTED - same class, same package subclass, same package's non-subclass, different package subclass, different package subclass.
*/

import other.*;

class C extends B{
    
}

public class main {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.marks);
        obj.show();
        
        B obj1 = new B();
        System.out.println(obj1.marks);
    }
}

