package com.project;
import java.util.Scanner;
public class switchloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amount = 0.0;
        double balance = 0.0;
        double withdraw = 0.0;
        int selection;

        do {
            System.out.println("Enter choice menu: \n1.Initial deposit \n2.More money to add \n3.Withdraw:  ");
            selection = scan.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Enter the password number");
                    int password = scan.nextInt();
                    if (password == 123) {
                        System.out.println("Please enter initial deposit");
                        amount = scan.nextDouble();
                        balance = amount;
                        break;
                    }

                case 2:
                    System.out.println("Enter the password number");
                    password = scan.nextInt();
                    if (password == 123) {
                        System.out.println(" Please enter more amount");
                        amount = scan.nextDouble();

                        balance = balance + amount;

                        System.out.println("The balance is : " + balance);

                    } else {
                        System.out.println("Invalid login... Try again");
                        System.out.println("Enter the password number");
                        password = scan.nextInt();
                    }
                    break;

                case 3:
                    System.out.println(" Please enter withdraw");
                    withdraw = scan.nextDouble();
                    balance = balance - withdraw;
                    System.out.println("The amount  is now: " + balance);
                    break;
            }
            System.out.println("Enter choice menu: \n1.Initial deposit \n2.More money to add \n3.Withdraw:  ");
        }
        while (selection < 4);
    }
}






