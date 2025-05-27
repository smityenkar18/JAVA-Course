class Student{
    int rollno;
    String name;
    int marks;
    // these are instance variables, (which belong to a particular class not a method)
}

public class Array_Of_Objects {
    public static void main(String[] args) {
        // int nums[] = new int[4];
        // nums[0]= 4;
        // nums[1]= 8;
        // nums[2]= 3;
        // nums[3]= 9;
        
        // for(int i=0; i<7; i++){          would give run time exception (we are assigning for 4 values but iterating for 7, it will show 0 in place)
        //      System.out.println(nums[i]);
        // }
        
        // for(int i=0; i<nums.length; i++){
        //     System.out.println(nums[i]);
        // }
        
        Student s1 = new Student();
        s1.name = "Smit";
        s1.rollno =  1;
        s1.marks = 91;
        
        
         Student s2 = new Student();
        s2.name = "Tims";
        s2.rollno =  2;
        s2.marks = 81;
        
         Student s3 = new Student();
        s3.name = "AB";
        s3.rollno =  3;
        s3.marks = 89;
        
       
        
        Student students[] = new Student[3];     // Array which can hold student references
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for(int i=0; i<students.length; i++){
            // System.out.println(students[i]);       if used directly it gives address
             System.out.println(students[i].name + " : " + students[i].marks);
        }
        
    }
}
