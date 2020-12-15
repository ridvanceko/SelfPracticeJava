package ZoomPractices;
import java.util.Scanner;
public class StringPractice1 {
    public static void main(String[] args) {

        //print every letter of the given string

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string value ? ");
        String word = input.next();

        int index = 0;

        while(index < word.length()) {

            System.out.println(word.charAt(index));
              index++;
        }


    }

}
