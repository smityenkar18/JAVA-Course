// we cannot direclty extend 2 methods ,Threads and the other class becuase Multiple inheritance is not present in JAVA

class A implements  Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
        System.out.println("Hi");
        try {
            Thread.sleep(10);           // wait for 10 seconds 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }      
        }
    }
 }
 class B implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
        System.out.println("Hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        
            e.printStackTrace();
        }
        }
    }
 }

public class extending_other_class_in_thread {
    public static void main(String[] args) {
        
        // we can create reference of an interface and object of a class
        // Thread method has multiple constructor which takes Runnable object
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        
        // Runnable does not have start method
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        
        t2.start();
    }
}
