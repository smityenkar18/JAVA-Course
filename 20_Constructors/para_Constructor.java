 // Parameterized Constructor
 
 class Human {
    private int age;   // accessable in same class
    private String name;

    public Human(){                              // DEFAULT Constructor
        System.out.println("In Constructor");
        age = 21;
        name = "John";
    }
    
    public Human(int a, String n){              // PARAMETERIZED Constructor
       age = a;
       name = n;
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
 
 public class para_Constructor{
    public static void main(String[]args){
      Human obj = new Human();
      Human obj1 = new Human(21,"Smit");                     // Passing values 
        System.out.println(obj.getName()+ " :" + obj.getAge()); 
        System.out.println(obj1.getName()+ " :" + obj1.getAge());   
    }
 }