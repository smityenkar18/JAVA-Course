/* 
  *a here is local variable
  
  public void setAge(int a) {
        age = a;
    }

 */

class Human {
    private int age;   // accesable in same class
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // if we want our local variable and the instance variable to have same name.
        // it is like local variable is assigning the  value to itself and maybe there is no instance variable.
        // age is assigning value to itself
        
        // we need to clearly mention the Instance Variable, so use -> ( this keyword )
        
        this.age = age;   
                        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

public class this_keyword {
    public static void main(String[] args) {
        System.out.println("Encapsulation");
        Human obj = new Human();
        obj.setAge(11);
        obj.setName("Smit"); // Assigning value with the help of methods. 
        System.out.println(obj.getName()+ " :" + obj.getAge());
    }
}

/*
 *  or we can do like this : 
    
 public void setAge(int age, Human obj) {   // Accepting the object
        Human obj1 = obj
        obj1.age = age;   
                        
    }
      
    
    public static void main(String[] args) {
        System.out.println("Encapsulation");
        Human obj = new Human();
        obj.setAge(11,obj);                                                   // Passing the object to the method
        obj.setName("Smit"); // Assigning value with the help of methods. 
        System.out.println(obj.getName()+ " :" + obj.getAge());
    }
    
    Just assigning the object to the method and then accesing the data then assognng the value of the Local Variable.   
    
    *We dont need to pass the object and then use the object , we can directly use [(this) Keyword ] which represents the current object 
     (meaning: Object which is calling the method) .
 */

