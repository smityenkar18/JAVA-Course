/* What if we want to assign the values as soon as the object is created ?  
 * use Constructor - constructor looks like a method itself
 * constructor has name, round brackets, but dont specify the return type
 * Constructor is of the same name as that of the Class
 * Constructor is automatically invoked or called when the object is created
 * Constructor is a special method used to initialise the object's data members with initial values;
 * Everytime we create a object we call the constructor
 * 
 * Ex: We are trying to connect to the database, we need that connection, this connection can be written in the Constructor.
*/

class Human {
    private int age;   // accessable in same class
    private String name;

    public Human(){
        System.out.println("In Constructor");
        age = 21;
        name = "John";
    }
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;   
                        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class constructors {
    public static void main(String[] args) {
        System.out.println("Constructors");
        Human obj = new Human();
        System.out.println(obj.getName()+ " :" + obj.getAge());
         
        // obj.setAge(11);
        // obj.setName("Smit"); // Assigning value with the help of methods. 
       
    }
}
