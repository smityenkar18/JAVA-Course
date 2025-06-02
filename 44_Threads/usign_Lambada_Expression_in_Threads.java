// Uisng Lambada Expressions - not needed class A

// class A implements  Runnable{
//     public void run(){
//         for(int i=1; i<=5; i++){
//         System.out.println("Hi");
//         try {
//             Thread.sleep(10);           // wait for 10 seconds 
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }      
//         }
//     }
//  }

//  class B implements Runnable{
//     public void run(){
//         for(int i=1; i<=5; i++){
//         System.out.println("Hello");
//         try {
//             Thread.sleep(10);
//         } catch (InterruptedException e) {
        
//             e.printStackTrace();
//         }
//         }
//     }
//  }

// By implementing the Runnale class here itself in main we have reduced the use of making classes
public class usign_Lambada_Expression_in_Threads  {
    public static void main(String[] args) {
        
        // we can create reference of an interface and object of a class
        // Thread method has multiple constructor which takes Runnable object
        
        // using anonyomous class , implementing Runnable here itself
        
        Runnable obj1 = () ->
        {
        for(int i=1; i<=5; i++){
        System.out.println("Hi");
        try { Thread.sleep(10); } catch (InterruptedException e) {
            e.printStackTrace(); }      
        }
       };
    
        Runnable obj2 = () ->
        { 
            for(int i=1; i<=5; i++){
        System.out.println("Hello");
        try { Thread.sleep(10); } catch (InterruptedException e) {
            e.printStackTrace(); }      
        }
        };
        
        // Runnable does not have start method
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        
        t2.start();
    }
}
