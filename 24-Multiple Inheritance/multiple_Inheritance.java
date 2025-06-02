/* JAVA Does'nt support Multiple Inheritance 
 * 
 
    A                    B
    show()              x()
    y()                 y()
     |_____C(child)______|
             |
             v
             obj.show()
             obj.x()
             obj.y() 
             
    The problem comes here is the y() method is present in both the Parent class, so which method would be called ?
    - This creates a confusion , Here comes an Ambiguty (This is also called as Ambiguity Problem )
 
*/

public class multiple_Inheritance {
    public static void main(String[] args) {
              
    }
}
