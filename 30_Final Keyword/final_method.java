// To stop method Overriding we use final keyword before method.

 class Calc{
    public final void show(){
        System.out.println("By Smit");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

// class AdvCalc extends Calc{
//     public void show(){
//         System.out.println("By John");
//     }
// }                                      *Gives Error: No one can override the fianl method


public class final_method {
    public static void main(String[] args) {
        // AdvCalc obj = new AdvCalc();
        // obj.show();
        // obj.add(4, 5);
    }
}
