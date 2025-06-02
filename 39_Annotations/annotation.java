class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in A show");
    }
}

class B extends A{
    @Override // helps to solve the errors (or solve the problem at compie time.)
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in B show");
    }
}
public class annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
