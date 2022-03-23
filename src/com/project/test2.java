package com.project;
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the Student number: ");
        int number= scan.nextInt();

        //int count=0;
        int total=0;
        int average=0;
        while (number >=0) {
            // count+=number;



            System.out.println("Enter the Student Name: ");
            String name= scan.next();

            System.out.println("Enter the Student Major: ");
            String studentMajor = scan.next();

            System.out.println("Enter the Student grade 1: ");
            int grade1 = scan.nextInt();

            System.out.println("Enter the Student grade 2: ");
            int grade2 = scan.nextInt();
            total = grade1 + grade2 ;
            average = total/2;

            System.out.println("Enter Student number: ");
            number = scan.nextInt();

        }
        System.out.println("The class sum is: "+ total);
        System.out.println("The class average is: "+ average);

        if(average<=200) {
            System.out.println("D");
        }
        else if (average >=500) {
            System.out.println("A");
        }

    }
}

