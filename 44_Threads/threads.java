/* 
      Software
         |
        O.S
         |
      Hardware_______ CPU 
             |_______ RAM 
             
     In a software :
     Threads support Multitasking ,       
 */

 // if we want to make the classes as threads , just extend the thread to Thread class
 // the start method written below required to the Threads calls a run() method, so in every thread we must have a run method 
 
 
 class A extends  Thread{
    public void run(){
        for(int i=1; i<=100; i++){
        System.out.println("Hi");
        try {
            Thread.sleep(10);           // wait for 10 seconds 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }      
        }
    }
 }
 class B extends Thread{
    public void run(){
        for(int i=1; i<=100; i++){
        System.out.println("Hello");
        try {
            sleep(10);
        } catch (InterruptedException e) {
        
            e.printStackTrace();
        }
        }
    }
 }
public class threads {
    public static void main(String[] args) {
        
        
        A obj1 = new A();
        B obj2 = new B();
        
        // now we want parallel execiton of the both the methods
        
        // for the parallelism we need to call a start for both the methods
        
        obj2.setPriority(Thread.MAX_PRIORITY);
        
        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
      
            e.printStackTrace();
        }
        obj2.start();
        
        // By priority we only suggest the schedular to set the priority of th thread.
        // Schedular allows which threads to execute when.
        // we cannot suggest schedular just give priority. 
        // we have a concept of Thread Priority
        
        
    }   
}
