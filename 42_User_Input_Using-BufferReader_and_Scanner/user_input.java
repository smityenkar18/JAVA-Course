import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class user_input {
    public static void main(String[] args) throws IOException{
        
        System.out.println("Enter a Number :");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        
        bf.close();  // close the resources
    }
}
