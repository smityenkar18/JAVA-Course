class Student{
    int rollno;
    String name;
    int marks;
    // these are instance variables, (which belong to a particular class not a method)
}
public class For_Each {
    public static void main(String[] args) {
        System.out.println("For Each Loop");
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;
        
        for(int n : nums){
           System.out.println(n); 
        }
        
        /*
         we are saying -> give me a the value from the  nums array ie. n (or give me one value at a time)
         one value go into n
         o/p: 
           4
           8
           3
           9
         */
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
        
        // Using Enhanced For Loop
        for(Student stud : students){
            System.out.println(stud.name + ":"+ stud.marks);
        }
    }
}
