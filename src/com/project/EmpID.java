package com.project;
import java.util.Scanner;
public class EmpID {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // ask to input data through scanner instead of given values
        System.out.println("WELCOME TO JRC COMPANY ");

        System.out.println("Enter Employee ID: ");
        int empid = scan.nextInt();

        empid=0;
        int total=0;
        while (empid >=0) {


            System.out.println("Enter Employee name : ");
            String emp_name = scan.next();

            System.out.println("Enter Employee department: ");
            String empdept = scan.next();

            System.out.println("Enter Employee monthly salary: ");
            int empmonthsalary = scan.nextInt();

            double subtotal =empmonthsalary * 12;

            System.out.println("Enter Employee ID: ");
            empid = scan.nextInt();


            System.out.println("Employee name  is : "+ emp_name);
            System.out.println("Employee dept  is : "+ empdept);
            System.out.println("Employee mnth salary  is : "+ empmonthsalary );
            System.out.println("Employee yearly salary  is : "+ subtotal );
        }

    }
}


