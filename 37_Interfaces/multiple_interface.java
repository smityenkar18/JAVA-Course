/* In Java Multiple Inheritance can be possible with the help of interface
 * 
 *    B class implements from A and X
 *    
 *     A               X
 *     |_______________|
 *            |
 *            B                 
 */

interface A{
    int age = 44;
    String area = "Mumbai";
    void show();      
    void config(); 
 
}

interface X{
    void run();
    // just write the implementation of this method in the class below.
}

 class B implements A,X
 {            
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }  
    
    
    public void run(){
        System.out.println("running");
    }
 }
 
 
public class multiple_interface {
    public static void main(String[] args) {
        
    }
}
