package Practice;

public class Operators {
    public static void main (String args[]) {


        int a = 10;
        int b = 20;


        //Arithmetic Operators --> + - * / %

        System.out.println("Addition of a and  b is: " +(a+b));
        System.out.println("Subtraction of a and  b is: " +(b-a));
        System.out.println("Multiplication of a and  b is: " +(a*b));
        System.out.println("Division of a and  b is: " +(a/b));        //This will be  remainder
        System.out.println("Modular Div of a and  b is: " +(a%b));


        //Relational Operators (Comparison operators) --> == ,  < > , <= , >=, !=,
        //Always return as a boolean value

        System.out.println(a==b);    //false
        System.out.println(a<b);     //true
        System.out.println(a>b);     //false
        System.out.println(a>=b);    //false
        System.out.println(a<=b);    //true
        System.out.println(a!=b);    //true


        




    }
}
