interface Computer{
     void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();                       
    }
}

public class interfaces_2 {         
    public static void main(String[] args) {
        Computer lap = new Laptop();             // Now these are the Interface reference (lap) not class Reference
        Computer desk = new Desktop();
        Developer smit = new Developer();
        smit.devApp(desk);
        
    }
}
