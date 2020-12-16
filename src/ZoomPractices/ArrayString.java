package ZoomPractices;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {

        //using scanner ask user to enter the element number of the String array
        //using scanner ask user each element of the array
        //if the length of the element is bigger than 5 than assign it inside the array

        Scanner input  = new Scanner(System.in);
        System.out.println("Element number of string array? ");
        int number = input.nextInt();

        String [] names = new String[number];

        int indexNumber = 0;
        for(int i=0; i<number; i++) {
            System.out.println("What is the name? ");
            String name = input.next();
            if (name.length() >5) {
                names[indexNumber++] = name;
            } else
                names[i] = "Invalid entry";

        }
        System.out.println(Arrays.toString(names));

    }
}
