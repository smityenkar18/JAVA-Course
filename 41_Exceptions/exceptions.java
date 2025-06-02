// Exception Handling

public class exceptions {
    public static void main(String[] args) {
        System.out.println(2+2);
        int i = 0;
        int j = 0;
        
        int nums[] = new int[5];
        String str = null;
        
        try { 
        j= 18/i;
        System.out.println(str.length());
        System.out.println(nums[1]);
        System.out.println(nums[5]);
        }
        
        // try executed the block then gives the object , which we accepted in the catch , e is the object
        catch(ArithmeticException e){
            
            System.out.println("Something went Wrong !" + e);
            
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

/* 
    object class
          |
    -Throawable-- 
    |           |
  Error        Exception
  __|________        __|________________________________
  |     |   |        |                                 |
 Thread |   IO      RunTime                        SQL Exception
 Death  |  Error    Exceptions                          | 
        |            |___ Arithmetic exception     I/O Exception
        v            |___ Array Index exception
    Virtual Machine  |___ Null / Pointer                         
     Error
        |           |__________________________|   |____________|
        v                        |                      |
  Out of memory            Unchecked Exceptions    Checked Exceptions
    
 */

      
