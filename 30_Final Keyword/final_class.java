// here final keyword can be used when we want no other class to extend our class.
// once we use final for our class , we are stopping the inheritance
 
final class Calc{
    public void show(){
        System.out.println("In calc show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

// class AdvCalc extends Calc{
    
// }                              gives error: as inheritance is not possible for Calc class becuase it is declared as inherited


public class final_class  {
    public static void main(String[] args) {
        
       Calc obj = new Calc();
        obj.show();
        obj.add(4, 5);
    }
}
