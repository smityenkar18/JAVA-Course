// enums - (enumeration ) are  named constant ex: 404 (error)

enum Status{
    Running, Failed, Pending, Success;  // constants
}

public class enums {
    public static void main(String[] args) {
        int i=5;
        Status s =  Status.Running;  // Status is a class here in java
        System.out.println(s);
        
         Status y =  Status.Failed; 
         System.out.println(y.ordinal());
         
         Status[] ss = Status.values();
         System.out.println(ss);
         
         for(Status m : ss){                   // Enhanced for Loop
           
            System.out.println(m + ":" + m.ordinal());
         }
    }
}
