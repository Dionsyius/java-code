package com.project;
import java.util.Scanner;
public class bank {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // ask to input data through scanner instead of given values
        System.out.println("WELCOME TO WELLS FARGO BANK OF LA ");

        System.out.println("Enter account Number: ");
        int account_number = scan.nextInt();

        System.out.println("Enter account name : ");
        String account_name = scan.next();

        System.out.println("Enter deposit Amount: ");
        int deposit = scan.nextInt();

        System.out.println("Enter withdraw Amount: ");
        int withdraw = scan.nextInt();


        int Account_total;
        Account_total = (deposit - withdraw);

        // print all variables above
        System.out.println("--------------------------/n");
        System.out.println("The account number is : " + account_number);
        System.out.println("The account name  is : " + account_name);
        System.out.println("The deposit Amount is : " + deposit);
        System.out.println("The withdraw Amount is : " + withdraw);
        System.out.println("Your balance is : " + Account_total);


        if (Account_total >=200000 ) {
            System.out.println("You are Rich ");
        }
        else if (Account_total >=100000 && Account_total <=199999) {
            System.out.println("You are almost Rich ");
        }
        else {
            System.out.println("You are not making good Cash");
        }
    }
}



