class SmitException extends Exception{
    public SmitException(String string){
        // to display message of the exception class we need to pass that string to super class constructor, ie. the Exception class.
        super(string);
    }
}

public class own_exception {
    public static void main(String[] args) {
         System.out.println(2+2);
        int i = 20;
        int j = 0;
        
        // exception for classNotFound
        try {
            Class.forName( "Xtz");
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Not able to find the class " + e);
        }
        
        try { 
        j= 18/i;
        if(j==0)
          // throw_new_expression name
          throw new SmitException("I don't want to print zero"); // we can also pass message in this constructor
        }
        
        // try executed the block then gives the object , which we accepted in the catch , e is the object
        catch(SmitException e){
            
            j =18/1;
            System.out.println("That's a default output " + e);
            
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in our Limits !");
        }
        
        // Exeption can handle all the type of exceptions , its kind of a parent class.   
        catch(Exception e){
            System.out.println("Something Went Wrong .. " + e);
        }
        
        // parent should be at the bottom     
        System.out.println(j);
        System.out.println("Bye");
    }
}
