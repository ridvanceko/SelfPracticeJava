package ScannertTechtorial;


import java.util.Scanner;

public class BankAccount {

    public static void main(String [] args ) {

        Scanner input = new Scanner(System.in);

        double accountBalance = 0;


        System.out.println("First withdraw is ");
        accountBalance -= input.nextDouble();

        System.out.println("Second withdraw is ");
        accountBalance -= input.nextDouble();

        System.out.println("How much paid for the bills? ");
        accountBalance -= input.nextDouble();

        System.out.println("Deposit your 2 weeks pay-check. ");
        accountBalance += input.nextDouble();

        System.out.println("Total money in your account is: " + accountBalance);
    }
}
