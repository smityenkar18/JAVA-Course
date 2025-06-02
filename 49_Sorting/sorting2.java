// Sorting With Student age
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student{
    int age;
    String name;
    
    public Student(int age, String name){
       this.age = age;
       this.name = name; 
    }
    
    public String toString(){
        return "Student [age=" + age + ", name=" + name + "]";
    }
}
public class sorting2 {
    public static void main(String[] args) {
        
          Comparator<Student> com = new Comparator<Student>(){
            public int compare(Student i, Student j){
                
                if(i.age > j.age)                
                  return 1;
                else
                 return -1;
            }
        };
       List<Student> studs = new ArrayList<>();
       studs.add(new Student(21,"Navin"));
       studs.add(new Student(12,"Smit"));
       studs.add(new Student(18,"John"));
       studs.add(new Student(20,"Kiran"));
       
       // compairing the student age.
       
       Collections.sort(studs,com);
       for(Student s: studs){
        System.out.println(s);
       }
    }
}
