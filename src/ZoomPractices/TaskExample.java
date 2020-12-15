package ZoomPractices;
import java.util.Scanner;
public class TaskExample {
    public static void main(String[] args) {

        //print every letter of the given string

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string value ? ");
        String word = input.nextLine();



        for(int i=0; i<word.length(); i++) {
            if (word.charAt(i) == 'e' || word.charAt(i)== 'E') {
                System.out.print(" ");
                continue;
            }
            System.out.print(word.charAt(i));


        }

    }}
