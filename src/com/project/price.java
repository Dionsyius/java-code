package com.project;
import java.util.Scanner;
public class price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item;
        double item_price;
        String quantity;
        double quantity_price;

        // ask to input data through scanner instead of given values
        System.out.print("Enter the item: ");
        item = sc.next();

        System.out.print("Enter the item price: ");
        item_price = sc.nextDouble();

        System.out.print("Enter the quantity : ");
        quantity_price = sc.nextDouble();


        double subtotal = item_price * quantity_price;


        ///////calculation//////

        System.out.println(subtotal);

        // print all variables above
        System.out.println("--------------\n");
        System.out.println("The Item is:" + item);
        System.out.println("The qnty price is:" + quantity_price);
        System.out.println("The item price is:" + item_price);
        System.out.println("Your  total is:" + subtotal);
    }
}






