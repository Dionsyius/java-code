package com.project;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Passanger Database :  ");
        System.out.println("WELCOME TO NJ Transit : ");




        String Destination;
        int  drivenMiles;
        int Gasgallons;
        int result;




        System.out.println("Enter Destination or City: ");
        Destination = scan.next();
        System.out.println("How many Miles have you driven: ");
        drivenMiles = scan.nextInt();
        System.out.println("How many gallons of Gas have been used: ");
        Gasgallons= scan.nextInt();

        result = drivenMiles /  Gasgallons;

        System.out.println("Your cars MPG is " +result);

    }
}



