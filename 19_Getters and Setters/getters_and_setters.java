class Human{
    private int age;   // accesable in same class
    private String name;

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

public class getters_and_setters {
    public static void main(String[] args) {
        System.out.println("Encapsulation");
        Human obj = new Human();
        obj.setAge(11);
        obj.setName("Smit"); // Assigning value with the help of methods. 
       
    }
}
