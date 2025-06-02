/* Threads and Mutations together are not good idea !
 
    1. Threads      2). Mutations
    
    ex: T1 thread T2 thread
    
        t1         t2
        |__________|
              |
              i  
    If both the threads try to update a same variable , this can create a problem  
      
   Concept of Thread Safe: Only 1 thread can work 
   
   ex: t1 and t2 are threads only one of them work on show().
 */

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



class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class usign_Lambada_Expression_in_Threads  {
    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();
        Runnable obj1 = () ->
        {
        for(int i=1; i<=1000; i++){
            c.increment();
        }
       };
    
        Runnable obj2 = () ->
        { 
        
        for(int i=1; i<=1000; i++){
            c.increment();
        }
        };
        
        // each thread calls 1000 times , so in total 2000 times the increment method is being called
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        
        t2.start();
        
        // if we simply run this then evry time it wil give us differnt count because ,
        // we need to first let the both threads complete the incrementation works that join the count .
        
        t1.join();
        t2.join();
        System.out.println(c.count);
        
        // still everytime we run , we get different threads ( for this , when t1 is working on increment t2 must wait, this can be possible )
        // by using synchronized keyword in the method
    }
}
    