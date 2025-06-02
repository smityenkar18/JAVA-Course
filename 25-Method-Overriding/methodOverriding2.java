/* In Method Overriding we have methods with same -> Name, parameters, return type But different Behaviour. 
 * 
 * Below the method in Calc returns n1+n2
 * in AdvCalc the method returns n1 + n2 +1.
 * Hence Behaviour of these methods is different.
*/

class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
}

class AdvCalc extends Calc{
    public int add(int n1, int n2){
        return n1+n2+1;
    }
}

public class methodOverriding2 {
    public static void main(String[] args) {
        
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}

/*
*The class AdvCalc inherits The class Calc, so all the features in the Calc will be present in the AdvCalc */

/* The add method in then AdvCalc is Overriding the add method in the Calc. 
 * - when we create the object,
 * - it first search for the add method in the same class, if not present then go to the parent class, if it is available then execute it.
 * 
 * In our case it was present in the AdvCalc Method , so it was called and the method in the Calc was overridden.
 * 
*/