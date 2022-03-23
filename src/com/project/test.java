package com.project;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the Student number: ");
        int number= scan.nextInt();

        System.out.println("Enter the Student Name: ");
        String name= scan.next();

        System.out.println("Enter the Student grade 1: ");
        int grade1 = scan.nextInt();

        System.out.println("Enter the Student grade 2: ");
        int grade2 = scan.nextInt();

        double total = grade1 + grade2/2 ;

        System.out.println("The student number is : "+ number);
        System.out.println("The student name  is: "+ name);
        System.out.println("The student grade  is: "+ grade1);
        System.out.println("The student grade  is: "+ grade2);
        System.out.println("The total average  is: "+ total);

        if(total>=90) {
            System.out.println("A");
        }
        else if (total >=80) {
            System.out.println("B");
        }
        else if(total>=70) {
            System.out.println("C");
        }
        else if(total>=60) {
            System.out.println("D");
        }
        else {
            System.out.println("The grade is F");
        }
    }

}


