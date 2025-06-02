
class A{
    public void show() throws ClassNotFoundException{
         
        Class.forName("Calc");
    }
}
public class throws_keyword {
    static{
        System.out.println("Class Loaded");
    }
    
    // not good idea to write exception for main class , as JVM calls it, JVm will simply stop the execution
    // public static void main(String[] args) throws ClassNotFoundException{
        
    //    A obj = new A();
    //    obj.show();
    // }
    
    public static void main(String[] args) {
        
       A obj = new A();
       try {
           obj.show(); 
       } catch (ClassNotFoundException e) {
        e.printStackTrace();
       }
      
    }
}
