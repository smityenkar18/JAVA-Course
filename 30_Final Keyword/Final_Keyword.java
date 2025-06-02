// final - keyword can be used with a variable,method, class
// when we make a variable as final it becomes constant. in C++ we have const for this.

public class Final_Keyword {
    public static void main(String[] args) {
       final int num = 8;
       // num=9;                       // gives error: cant chnage the value of num
        System.out.println(num);
    }
}
