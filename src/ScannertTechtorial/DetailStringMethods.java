package ScannertTechtorial;
import java.util.Scanner;

public class DetailStringMethods {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Favorite team name? ");
        String teamName = input.nextLine();

        //Liverpool
        //Chicago Bulls
        //Arizona Wildcats

        //last char, first letter, length, middle char, char 4,

        int length = teamName.length();

        System.out.println("Last character of team: " +teamName.charAt(length-1));
        System.out.println("First character of team: " +teamName.charAt(0));
        System.out.println("Length of team: " +teamName.length());
        System.out.println("Middle character of team: " +teamName.charAt(length/2));
        System.out.println("Character of letter 4: " +teamName.charAt(4));
        System.out.println("Index of 'i': " +teamName.indexOf("i"));




    }
}
