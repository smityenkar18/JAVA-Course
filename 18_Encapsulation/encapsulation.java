class Human{
    private int age;   // accesable in same class
    private String name;
    
    // GETTERS
    public int getAge(){
        return age;
    }
    //Here we can access the 'age', we can access the age variable , inside the method of the same class.
    
    public String getName(){
        return name;
    }
    
    // SETTERS
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
}

/*whenever we create instance variables, make it private , the outside classes must not access it, 
if they want to use the data in the class , they should use the methods to access them.
 * 
*/

public class encapsulation {
    public static void main(String[] args) {
        System.out.println("Encapsulation");
        Human obj = new Human();
        obj.setAge(11);
        obj.setName("Smit"); // Assigning value with the help of methods. 
        System.out.println(obj.getName()+ " :" + obj.getAge()); // dont call direclty the data as they are private , call the methods to use them.
    }
}

/*
   Here we are encapsulatingg the data and the Methods so thats the reason it is called Encapsulation
 */