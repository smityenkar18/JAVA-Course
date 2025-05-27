
public class string {
    public static void main(String[] args) {
       // String n = "Smit";
        // creating a new String object 
        String name = new String("Smit"); // new object created in the Heap, 
        //inside the String constructor we are passing the name Smit as String("Smit")
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("Hello " + name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" Yenkar "));
        name = name + " Yenkar ";
        System.out.println("hello "+ name);
        
        // We are not chnaging the existing String. 
        
        String s1 =  " Smit";
        String s2 = " Smit";
        
        
    }
}
