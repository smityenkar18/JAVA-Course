/* if B implements Y then also we need to keep the void run() method in the class B because interface Y extends X
 * 
 * class-to-class -> extends
 * class-to-interface -> implements
 * interface-to-interface -> extends
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

interface Y extends X{        // in this Y we wil; have void run() as well
    
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
 
 

public class interface_to_interface_inheritance {
    public static void main(String[] args) {
        
    }
}
