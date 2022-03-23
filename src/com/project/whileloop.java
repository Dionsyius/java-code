package com.project;
import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        int count=0;
        int sum=0;
        while ( number >= 0) {
            count+=number;

            System.out.println("Enter the item name : ");
            String name = scan.next();

            System.out.println("Enter the item price : ");
            int price = scan.nextInt();

            System.out.println("Enter the quantity of item: ");
            int quantity = scan.nextInt();

            sum = sum +( price * quantity);

            double tax = 0.06;
            double totaltax;
            double grandtotal;
            tax = sum*tax;
            grandtotal = sum + tax;

            System.out.print("Enter the number");
            number = scan.nextInt();




            System.out.println("--------------\n");
            System.out.println("The item name  is:"+ name);
            System.out.println("The qnty  is:"+ quantity );
            System.out.println("The item price is:"+ price );
            System.out.println("The totalsum is: " + sum);
            System.out.println("The tax is: " + tax);
            System.out.println("The grandtotal is: " + grandtotal);
            System.out.println("------- Thank you come again-------------");
        }
    }
}



