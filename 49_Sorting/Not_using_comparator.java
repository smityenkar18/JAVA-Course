// If we dont want to use comaparator then we need to implement the Comparable to our class.
// means : Collections.sort(studs,com); | we can do like : Collections.sort(studs); by using comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student implements Comparable<Student>{
    int age;
    String name;
    
    public Student(int age, String name){
       this.age = age;
       this.name = name; 
    }
    
    public String toString(){
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
    // Just the comparable has the compareTo methods which we need to define
    

    public int compareTo(Student  that){
        
        // we are comparing 2 students , so using 'that' for 2nd student 
         if(this.age > that.age)                
                  return 1;
                else
                 return -1;
    }
}
public class Not_using_comparator {
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
       
       Collections.sort(studs);
       
       for(Student s: studs){
        System.out.println(s);
       }
    }
}
