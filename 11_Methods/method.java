// Methods -> define's behaviour
/* in class Computer we defined a method called playMusic() with a return type as void and access given to the method is public.
     
 */
class Computer{
    public void playMusic(){
        System.out.println("Music Playing...");
    }
    
    public String getMeAPen(int cost){
        if(cost>=5)
         return "Pen";
        else
         return "Nothing"; 
    }
}

public class method {
    public static void main(String[] args) { 
        // main is a method , which means start of execution
        
        Computer computer = new Computer();      // computer is a reference variable, new Computer() is creating the object
        computer.playMusic();
        String str = computer.getMeAPen(4);
        System.out.println(str);
    }
}
