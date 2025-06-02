
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class try_with_finally {
    public static void main(String[] args) throws NumberFormatException, IOException{
        // in try we usually keep critical statements
        // if we dont have catch() scenario , then we can write finally
        // if we still have catch() we can write finally ,
        // we are writing it because if we have a scenario where due to an exception , some part of the code is skipped , because the catch part cathes the exception 
        // if we still want the skipped code to be executed we can place it in finally(),
        // example: The  System.out.println("Bye !"); | Code never reached here because of the exception,
        // so place it in the fianlly(), code in the finally executes whatever be the situation.
        // Irrespective of the exception the code in the finally block gets executed.
        // CLOSE THE RESOURCES IN THE FINALLY BLOCK, IT IS MEANT FOR THIS PURPOSE ONLY !
        
        int i=0;
        int j=0;
        
        try{
         j =18/i;
         System.out.println("Bye !");
         
         
        }
        catch(Exception e){
            System.out.println("Something get wrong !");
        }
        finally{
            System.out.println("Bye !");
        }
        
        int num =0;
        BufferedReader br = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
            
        } catch (Exception e) {
            
        }
        
        finally{
            br.close();                              // closing the resource
            
        }
    }
}

/* try autoclosable
  
 try { BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
            
        } 

 */
