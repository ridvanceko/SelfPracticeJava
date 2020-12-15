package Practice;

public class Casting {

    public static void main(String [] args) {

//        int num = 100;
//        byte num1 = num;    ----> Compile error

           int num = 100;
           byte num1 = (byte)num;

           System.out.println(num1);
    }
}
