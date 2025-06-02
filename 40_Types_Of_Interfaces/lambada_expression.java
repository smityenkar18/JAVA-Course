
@FunctionalInterface
interface A{
    void show(int i, int j);
    
    
}

interface B{
    int add(int i, int j);
}
// Lambada expression - for reducing the code. 
public class lambada_expression {
    public static void main(String[] args) {
        
        //  A obj = new A(){
        //     public void show(){
        //         System.out.println("in show");
        //     }
        // };
        // obj.show();
        
        // behind the scene compiler is completing the code
        
         A obj = (int i, int j) -> System.out.println("in show" + i);
         obj.show(5,6);
         
         
        //  B obj1 = (int i,int j) -> 
        //   {
        //     return i+j;
        //   };
        // this can be further modified.
        B obj1 = ( i,j) -> i+j;
          
         int result = obj1.add(4,5);
         System.out.println(result);
    }
        
}

