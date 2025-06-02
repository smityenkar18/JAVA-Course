/*  
   Map: collection of Key and value pair
   
   Key : Value
   Navin: 56
   HARSH : 23
   Sushil : 67
   Kiran : 92
   
   For this :  Map<String,Integer> students = new HashMap<>(); | We can have a Hashtable also 
   
   if we want synchronized version use -> Hashtable (if there are multiple threads working then it is better to use synchronized)
   or use HashMap
 */

import java.util.HashMap;
import java.util.Map;
public class map {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Smit",56);
        students.put("Harsh",23);
        students.put("Sushil",67);
        students.put("Kiran",92);
        students.put("Harsh", 45);
        // why we use put ? -> Try to add the element, if you apready have this key, just replace it.
        // The key cannot be repeated, they are unique.
        
        
        System.out.println(students);
        System.out.println(students.get("Kiran"));
        System.out.println(students.keySet());
        
        // get method gets all the values 
        students.get("Smit");
        
        // To print all the values of map
        
        for(String key: students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
    }
}
