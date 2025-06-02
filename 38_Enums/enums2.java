enum Status{
    Running, Failed, Pending, Success;  // constants
}

// if else and switch in enums

public class enums2 {
    public static void main(String[] args) {
        Status s = Status.Pending;
        
        switch(s) {
            case Running:
             System.out.println("All Good");
             break;
             
            case Failed:
            System.out.println("Try Again");
            break;
            
            case Pending:
            System.out.println("Please Wait");
            break;
            
            case Success:
            System.out.println("Done");
            
            default:
             System.out.println("No case");
             break;
        }
        
        if(s == Status.Running)
          System.out.println("All Good");
        else if(s== Status.Failed) 
          System.out.println("Try Again"); 
          
        else if(s== Status.Pending) 
          System.out.println("Please Wait"); 
          
        else 
          System.out.println("Done");
    }
}
