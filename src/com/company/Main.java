package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String appetizer;
        double app_price;
        String meal;
        double meal_price;
        String drink;
        double drink_price;
        String dessert;
        double dessert_price;
        // ask to input data through scanner instead of given values
        System.out.println("Enter the appetizer: ");
        appetizer = scan.next();
        System.out.println("Enter the appetizer price: ");
        app_price = scan.nextDouble();
        System.out.println("Enter the meal: ");
        meal = scan.next();
        System.out.println("Enter meal price: ");
        meal_price = scan.nextDouble();
        System.out.println("Enter drink : ");
        drink = scan.next();
        System.out.println("Enter drink price: ");
        drink_price = scan.nextDouble();
        System.out.println("Enter dessert: ");
        dessert = scan.next();
        System.out.println("Enter dessert price: ");
        dessert_price = scan.nextDouble();

        ///////calculation//////
        double subtotal;
        double tax = 0.06;
        double total_tax;
        double grand_total;
        subtotal = (app_price + meal_price + drink_price + dessert_price);
        total_tax = subtotal * tax;
        grand_total = subtotal + total_tax;

        // print all variables above
        System.out.println("--------------\n");
        System.out.println("The subtotal is: " + subtotal);
        System.out.println("The tax is: " + tax);
        System.out.println("The total tax is: " + total_tax);
        System.out.println("The grand total is: " + grand_total);
        System.out.println("------- Thank you come again-------------");


    }
}
